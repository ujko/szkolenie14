package day7.bookstore;

import day7.bookstore.dao.BookDAO;
import day7.bookstore.dao.BookDAOMem;
import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOMem();
//        System.out.println(bookDAO.getAllBooks());
//        Book book = new Book( "Tytul", "Typ",new Author(4, "Piotr", "Kowalski"),39.90);
//        bookDAO.addBook(book);
//        System.out.println("******************************");
//        System.out.println(bookDAO.getAllBooks());
//        System.out.println("******************************");
        System.out.println(bookDAO.removeBook(2));
//        System.out.println("******************************");
//        System.out.println(bookDAO.getAllBooks());
//        System.out.println("******************************");
//        System.out.println(bookDAO.findBookByID(15));
//        System.out.println("******************************");
//        System.out.println(bookDAO.findBookByTitle("so"));
//        System.out.println("******************************");
//        System.out.println(bookDAO.findBooksByTitle("ar"));
//        System.out.println("******************************");
//        System.out.println(bookDAO.findBookByAuthor(new Author(1,"","")));
        Book book = new Book( "Tytul", "Typ",new Author(4, "Piotr", "Kowalski"),39.90);
        bookDAO.addBook(book);
        System.out.println(bookDAO.getAllBooks());
        Book book1 = new Book(3,"Zmieniona książka", "Typ",new Author(4, "Piotr", "Kowalski"),39.90);
        bookDAO.editBook(book1.getId(),book1);
        System.out.println(bookDAO.getAllBooks());
    }
}
