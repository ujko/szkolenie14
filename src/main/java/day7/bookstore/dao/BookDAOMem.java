package day7.bookstore.dao;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;


import java.util.*;

public class BookDAOMem implements BookDAO {
    private Map<Integer, Book> mapa = new HashMap<>();

    public BookDAOMem() {
        insertBooks();
    }

    private void insertBooks() {
        Author lem = new Author(1, "Stanislaw", "Lem");
        Author sapkowski = new Author(2, "Andrzej", "Sapkowski");
        int id1 = generateID();
        mapa.put(id1, new Book(id1, "Solaris","SF", lem, 30.0));
        int id2 = generateID();
        mapa.put(id2, new Book(id2, "Wiedzmin", "Fantasy", sapkowski, 25.5));
        int id3 = generateID();
        mapa.put(id3, new Book(id3, "Narenturum", "Fantasy", sapkowski, 45.99));
        int id4 = generateID();
        mapa.put(id4, new Book(id4, "Wysoki zamek", "SF", lem, 39.90));
        int id5 = generateID();
        mapa.put(id5, new Book(id5, "Dzienniki gwiazdowe", "SF", lem, 49.90));
    }


    @Override
    public void addBook(Book book) {
        book.setId(generateID());
        mapa.put(book.getId(), book);

    }
    private int generateID1(){
        Set<Integer> keys = mapa.keySet();
        int result = 0;
        for (int i : keys) {
            if (i > result){
                result = i;
            }
        }
        return result + 1;
    }

    private int generateID(){
        Set<Integer> keys = mapa.keySet();
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
        return mapa.remove(id);
    }

    @Override
    public Book findBookByID(int id) {
        return mapa.get(id);
    }

    @Override
    public Book findBookByTitle(String title) {
        List<Book> bookList = getAllBooks();
        for (Book book: bookList){
            if (book.getTitle().contains(title)){
                return book;
            }
        }
        return null;
    }


    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> bookList = getAllBooks();
        List<Book> result = new ArrayList<>();
        for (Book book: bookList){
            if (book.getTitle().contains(title)){
                result.add(book);
            }
        }
        return result;

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
        mapa.put(id,book);
    }

    @Override
    public List<Book> getAllBooks() {
        Collection<Book> books = mapa.values();

        return new ArrayList<>(books);
    }
}
