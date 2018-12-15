package day7.bookstore.view;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;

import java.util.Scanner;

public class UserInput {

    public Book getBookFromUser() {
        String title = getData("Podaj tytul");
        String type = getData("Podaj gatunek");
        String price = getData("Podaj cene");
        double pp = Double.valueOf(price);
        Author author = new Author(5, "Stefan", "Laska");
        Book book = new Book(title, type,author,pp);
        return book;
    }
    private String getData(String message){
        System.out.print(message + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
