package com.example.BookExchangePortal.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.BookExchangePortal.user.User;

@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookTitle;
    private String author;

    @OneToOne
    @JoinColumn(name="portalPublisher",referencedColumnName = "userId")
    private User portalPublisher;
    private String edition;

    private String isbn;
    private Integer year;

    @OneToOne
    @JoinColumn(name="curHolder", referencedColumnName = "userId")
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