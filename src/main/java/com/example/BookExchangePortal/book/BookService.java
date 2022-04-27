package com.example.BookExchangePortal.book;

import java.util.List;
import java.util.Optional;

import com.example.BookExchangePortal.user.User;
import com.example.BookExchangePortal.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;
    private UserRepository userRepository;

    @Autowired
    public BookService(BookRepository bookRepository,UserRepository userRepository){
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void addNewBook(Book book){
        Optional<User> userOptional = userRepository.findUserByEmail(book.getPortalPublisher().getEmail());
		if(userOptional.isPresent()){
            Book newBook = new Book(book.getBookTitle(), book.getAuthor(), userOptional.get(), book.getEdition(), book.getIsbn(), book.getYear());
            bookRepository.save(newBook);
		}
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
