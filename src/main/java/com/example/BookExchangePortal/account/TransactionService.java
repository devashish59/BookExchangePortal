package com.example.BookExchangePortal.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository repository){
        this.transactionRepository = repository;
    }

    public List<Transaction> getTransactions(){
        return transactionRepository.findAll();
    }
}
