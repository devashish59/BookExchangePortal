package com.example.BookExchangePortal.account;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.BookExchangePortal.book.Book;

@Entity
@Table(name="transaction" )
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;

    private String exchangeLoc;
    private LocalDateTime exchaDateTime;
    private LocalDateTime expRetDateTime;
    private LocalDateTime actualRetDateTime;

    @OneToOne
    @JoinColumn(name="bid", referencedColumnName = "bookid")
    private Book book;

    @ManyToOne
    @JoinColumn(name="lenderAccno")
    private Account lenderAccount;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne
    @JoinColumn(name="borrowerAccno")
    private Account borrowerAccount;

    private Integer penalty;

    public Transaction(){

    }
    
    public Transaction(Integer transactionId, String exchangeLoc, LocalDateTime exchaDateTime,
            LocalDateTime expRetDateTime, LocalDateTime actualRetDateTime, Account lenderAccount, Account borrowerAccount, int penalty, Book book) {
        this.transactionId = transactionId;
        this.exchangeLoc = exchangeLoc;
        this.exchaDateTime = exchaDateTime;
        this.expRetDateTime = expRetDateTime;
        this.actualRetDateTime = actualRetDateTime;
        this.lenderAccount = lenderAccount;
        this.borrowerAccount = borrowerAccount;
        this.penalty = penalty;
        this.book = book;
    }

    public Transaction(String exchangeLoc, LocalDateTime exchaDateTime, LocalDateTime expRetDateTime,
            LocalDateTime actualRetDateTime, Account lenderAccount, Account borrowerAccount, int penalty) {
        this.exchangeLoc = exchangeLoc;
        this.exchaDateTime = exchaDateTime;
        this.expRetDateTime = expRetDateTime;
        this.actualRetDateTime = actualRetDateTime;
        this.lenderAccount = lenderAccount;
        this.borrowerAccount = borrowerAccount;
        this.penalty = penalty;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
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

    public Account getlenderAccount() {
        return lenderAccount;
    }

    public void setlenderAccount(Account lenderAccount) {
        this.lenderAccount = lenderAccount;
    }

    public Account getborrowerAccount() {
        return borrowerAccount;
    }

    public void setborrowerAccount(Account borrowerAccount) {
        this.borrowerAccount = borrowerAccount;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
    
}
