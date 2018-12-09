package day7.bookstore.domain;

public class Book {
    private int id;
    private String title;
    private String type;
    private Author author;
    private double price;

    public Book(String title, String type, Author author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public Book(int id, String title, String type, Author author, double price) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}'+ '\n';
    }
}
