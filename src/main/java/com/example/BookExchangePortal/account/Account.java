package com.example.BookExchangePortal.account;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "account", schema = "bookexchange")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accno;
    private Integer balance;

    @OneToMany(mappedBy = "lenderAccount",cascade = CascadeType.ALL)
    private List<Transaction> lendingtransactionList;

    @OneToMany(mappedBy = "borrowerAccount",cascade = CascadeType.ALL)
    private List<Transaction> borrowingTransactionList;
    
    public Account(Integer accno, Integer balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public Account() {
        balance = 0;
    }

    public Integer getAccno() {
        return accno;
    }


    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List<Transaction> getLendingtransactionList() {
        return lendingtransactionList;
    }

    public List<Transaction> getBorrowiTransactionList() {
        return borrowingTransactionList;
    }
    
}
