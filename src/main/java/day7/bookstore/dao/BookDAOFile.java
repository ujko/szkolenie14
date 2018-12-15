package day7.bookstore.dao;


import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import utils.Utils;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class BookDAOFile implements BookDAO{
    public static final String BOOKS_DAT = "Books.dat";
    private Map<Integer,Book> katalogKsiazek;

    public BookDAOFile(){
        try {
            katalogKsiazek= (Map<Integer, Book>) Utils.readObject(BOOKS_DAT);
        } catch (Exception e) {
            katalogKsiazek = new HashMap<>();
        }
    }

    @Override
    public void addBook(Book book) {
        book.setId(generateID());
        katalogKsiazek.put(book.getId(), book);
        saveObjectToFile();
    }

    private void saveObjectToFile() {
        try {
            Utils.writeObject(BOOKS_DAT, katalogKsiazek);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku.");
        }
    }

    private int generateID(){
        Set<Integer> keys = katalogKsiazek.keySet();
        int result = 1;
        for (int i : keys) {
            if (i != result){
                return result;
            }
            result++;
        }
        return result;
    }

    @Override
    public Book removeBook(int id) {
        Book book = katalogKsiazek.remove(id);
        saveObjectToFile();
        return book;
    }

    @Override
    public Book findBookByID(int id) {
        return katalogKsiazek.get(id);
    }

    @Override
    public Book findBookByTitle(String title) {
        return katalogKsiazek.values().stream().filter(x -> x.getTitle().contains(title)).findFirst().orElse(new Book());
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        return katalogKsiazek.values().stream().filter(x -> x.getTitle().contains(title)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        int id = author.getId();
        List<Book> books = new ArrayList<>();
        List<Book> bookList = getAllBooks();
        for (Book book: bookList){
            Author author1 = book.getAuthor();
            int a = author1.getId();
            if (a==id){
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public void editBook(int id, Book book) {
        katalogKsiazek.put(id,book);
        saveObjectToFile();
    }

    @Override
    public List<Book> getAllBooks() {
        Collection<Book> books = katalogKsiazek.values();
        return new ArrayList<>(books);
    }
}
