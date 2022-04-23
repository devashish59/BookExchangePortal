package com.example.BookExchangePortal.request;

import java.time.LocalDateTime;

import com.example.BookExchangePortal.user.User;

public class Request {
    private String bookTitle;
    private LocalDateTime expectedRetDtTime;
    private final User requestCreator;
    
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
