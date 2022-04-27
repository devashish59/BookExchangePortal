package com.example.BookExchangePortal.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void deleteBook(Integer bookId){
		boolean exists = bookRepository.existsById(bookId);
		if(!exists)
		{
			throw new IllegalStateException("Book with Id "+bookId+" does not exists.");
		}
		bookRepository.deleteById(bookId);
	}
    
}
