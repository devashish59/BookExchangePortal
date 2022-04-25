package com.example.BookExchangePortal.account;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String transactionId;

    private String exchangeLoc;
    private LocalDateTime exchaDateTime;
    private LocalDateTime expRetDateTime;
    private LocalDateTime actualRetDateTime;

    @ManyToOne
    @JoinColumn(name="lenderAccno",nullable = false)
    private Account lenderAccount;

    @ManyToOne
    @JoinColumn(name="borrowerAccno",nullable = false)
    private Account borrowerAccount;

    private int penalty;
    
    public Transaction(String transactionId, String exchangeLoc, LocalDateTime exchaDateTime,
            LocalDateTime expRetDateTime, LocalDateTime actualRetDateTime, Account lenderAccount, Account borrowerAccount, int penalty) {
        this.transactionId = transactionId;
        this.exchangeLoc = exchangeLoc;
        this.exchaDateTime = exchaDateTime;
        this.expRetDateTime = expRetDateTime;
        this.actualRetDateTime = actualRetDateTime;
        this.lenderAccount = lenderAccount;
        this.borrowerAccount = borrowerAccount;
        this.penalty = penalty;
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
