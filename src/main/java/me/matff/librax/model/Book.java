package me.matff.librax.model;

public class Book {
    public long id;
    public String isbn;
    public String title;
    public String author;
    public String year;

    // Constructor
    public Book(long id, String isbn, String title, String author, String year) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Long getID() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }
}