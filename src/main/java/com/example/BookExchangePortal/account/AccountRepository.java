package com.example.BookExchangePortal.account;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer>{
    
    @Query("SELECT a FROM Account a where a.accno=?1")
    Optional<Account> findAccountByAccountNo(Integer accno);
}
