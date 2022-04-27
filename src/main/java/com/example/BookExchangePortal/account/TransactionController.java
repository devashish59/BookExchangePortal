package com.example.BookExchangePortal.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/transaction")
public class TransactionController {
    
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }
    

    @GetMapping
    public List<Transaction> getTransactions(){
        return transactionService.getTransactions();
    }
}
