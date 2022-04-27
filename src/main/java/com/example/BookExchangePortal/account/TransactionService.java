package com.example.BookExchangePortal.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    
    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    @Autowired
    public TransactionService(TransactionRepository repository,AccountRepository accountRepository){
        this.transactionRepository = repository;
        this.accountRepository = accountRepository;
    }

    public List<Transaction> getTransactions(){
        return transactionRepository.findAll();
    }

    public void addTransaction(Transaction transaction){
        Optional<Account> lenderOptional = accountRepository.findAccountByAccountNo(transaction.getlenderAccount().getAccno());
        Optional<Account> borrowerOptional = accountRepository.findAccountByAccountNo(transaction.getborrowerAccount().getAccno());
        if(lenderOptional.isPresent() && borrowerOptional.isPresent()){
            Transaction newTx = new Transaction(transaction.getExchangeLoc(), transaction.getExchaDateTime(),
            transaction.getExpRetDateTime(), transaction.getActualRetDateTime(), lenderOptional.get(),borrowerOptional.get(), transaction.getPenalty());
            transactionRepository.save(newTx);
        }
        
    }

    public void deleteTransaction(Integer transactionId){
		boolean exists = transactionRepository.existsById(transactionId);
		if(!exists)
		{
			throw new IllegalStateException("account with Id "+transactionId+" does not exists.");
		}
		transactionRepository.deleteById(transactionId);
	}
}
