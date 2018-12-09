package day7.bookstore.dao;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;

import java.util.List;
import java.util.Set;

public interface BookDAO {

    void addBook(Book book);

    Book removeBook(int id);

    Book findBookByID(int id);

    Book findBookByTitle(String title);

    List<Book> findBooksByTitle(String title);

    List<Book> findBookByAuthor(Author author);

    void editBook(int id, Book book);

    List<Book> getAllBooks();
}
