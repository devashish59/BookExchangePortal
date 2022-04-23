package com.example.BookExchangePortal.account;

import java.time.LocalDateTime;
import com.example.BookExchangePortal.user.User;

public class Transaction {
    private String transactionId;
    private String exchangeLoc;
    private LocalDateTime exchaDateTime;
    private LocalDateTime expRetDateTime;
    private LocalDateTime actualRetDateTime;
    private User lender;
    private User borrower;
    private int penalty;
    
    public Transaction(String transactionId, String exchangeLoc, LocalDateTime exchaDateTime,
            LocalDateTime expRetDateTime, LocalDateTime actualRetDateTime, User lender, User borrower, int penalty) {
        this.transactionId = transactionId;
        this.exchangeLoc = exchangeLoc;
        this.exchaDateTime = exchaDateTime;
        this.expRetDateTime = expRetDateTime;
        this.actualRetDateTime = actualRetDateTime;
        this.lender = lender;
        this.borrower = borrower;
        this.penalty = penalty;
    }

    public Transaction(String exchangeLoc, LocalDateTime exchaDateTime, LocalDateTime expRetDateTime,
            LocalDateTime actualRetDateTime, User lender, User borrower, int penalty) {
        this.exchangeLoc = exchangeLoc;
        this.exchaDateTime = exchaDateTime;
        this.expRetDateTime = expRetDateTime;
        this.actualRetDateTime = actualRetDateTime;
        this.lender = lender;
        this.borrower = borrower;
        this.penalty = penalty;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getExchangeLoc() {
        return exchangeLoc;
    }

    public void setExchangeLoc(String exchangeLoc) {
        this.exchangeLoc = exchangeLoc;
    }

    public LocalDateTime getExchaDateTime() {
        return exchaDateTime;
    }

    public void setExchaDateTime(LocalDateTime exchaDateTime) {
        this.exchaDateTime = exchaDateTime;
    }

    public LocalDateTime getExpRetDateTime() {
        return expRetDateTime;
    }

    public void setExpRetDateTime(LocalDateTime expRetDateTime) {
        this.expRetDateTime = expRetDateTime;
    }

    public LocalDateTime getActualRetDateTime() {
        return actualRetDateTime;
    }

    public void setActualRetDateTime(LocalDateTime actualRetDateTime) {
        this.actualRetDateTime = actualRetDateTime;
    }

    public User getLender() {
        return lender;
    }

    public void setLender(User lender) {
        this.lender = lender;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
    
}
