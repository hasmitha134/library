package com.example.liberary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.liberary.repository.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepository;
	@Autowired
	public BookService(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository; 
	}
	public void DeleteBookById(Long id) {
		if(bookRepository.existsById(id)) {
			bookRepository.deleteById(id);
	}
	else {
		  throw new IllegalArgumentException("Book with ID " + id + " not found.");
	}
}
}
		
	        
	
		 

	
		



