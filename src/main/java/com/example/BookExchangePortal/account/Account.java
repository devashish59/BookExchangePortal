package com.example.BookExchangePortal.account;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String accno;
    private Integer balance;

    @OneToMany(mappedBy = "lenderAccount",cascade = CascadeType.ALL)
    private List<Transaction> lendingtransactionList;

    @OneToMany(mappedBy = "borrowerAccount",cascade = CascadeType.ALL)
    private List<Transaction> borrowingTransactionList;
    
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

    public List<Transaction> getLendingtransactionList() {
        return lendingtransactionList;
    }

    public List<Transaction> getBorrowiTransactionList() {
        return borrowingTransactionList;
    }
    
}
