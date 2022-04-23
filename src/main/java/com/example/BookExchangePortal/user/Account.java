package com.example.BookExchangePortal.user;

import java.util.List;

public class Account {
    private String accno;
    private Integer balance;
    private List<Transaction> transactionList;
    
    public Account(String accno, Integer balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccno() {
        return accno;
    }


    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    
    
}
