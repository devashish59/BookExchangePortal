package com.example.BookExchangePortal.book;

import com.example.BookExchangePortal.user.User;

public class Book {
    private String bookTitle;
    private String author;
    private User portalPublisher;
    private String edition;
    private String isbn;
    private Integer year;
    private User currentHolder;
    
    public Book(String bookTitle, String author, User portalPublisher, String edition, String isbn, Integer year,
            User currentHolder) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.portalPublisher = portalPublisher;
        this.edition = edition;
        this.isbn = isbn;
        this.year = year;
        this.currentHolder = currentHolder;
    }

    public Book(String bookTitle, String author, User portalPublisher, String edition, String isbn, Integer year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.portalPublisher = portalPublisher;
        this.edition = edition;
        this.isbn = isbn;
        this.year = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public User getPortalPublisher() {
        return portalPublisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public User getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(User currentHolder) {
        this.currentHolder = currentHolder;
    }

    
}
