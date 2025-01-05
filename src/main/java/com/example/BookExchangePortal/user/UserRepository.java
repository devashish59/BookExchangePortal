package com.example.BookExchangePortal.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    
    @Query("SELECT u FROM User u where u.email= :email")
    Optional<User> findUserByEmail(String email);

    @Transactional
    @Query("DELETE FROM User u where u.email= :email")
    void deleteByEmail(String email);
}
