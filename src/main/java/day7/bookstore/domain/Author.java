package day7.bookstore.domain;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String name;
    private String lastName;

    public Author() {
    }

    public Author(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
