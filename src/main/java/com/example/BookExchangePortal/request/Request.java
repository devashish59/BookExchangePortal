package com.example.BookExchangePortal.request;

import java.time.LocalDateTime;

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
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reqId;
    private String bookTitle;
    private LocalDateTime expectedRetDtTime;

    @OneToOne
    @JoinColumn(name="reqCreator",referencedColumnName = "userId")
    private User requestCreator;
    

    public Request(){

    }

    public Request(final String bookTitle, final LocalDateTime expectedRetDtTime, final User requestCreator) {
        this.bookTitle = bookTitle;
        this.expectedRetDtTime = expectedRetDtTime;
        this.requestCreator = requestCreator;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(final String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public LocalDateTime getExpectedRetDtTime() {
        return expectedRetDtTime;
    }

    public void setExpectedRetDtTime(final LocalDateTime expectedRetDtTime) {
        this.expectedRetDtTime = expectedRetDtTime;
    }

    public User getRequestCreator() {
        return requestCreator;
    }
    
}
