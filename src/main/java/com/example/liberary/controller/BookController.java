package com.example.liberary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.liberary.service.BookService;

@RestController
@RequestMapping("/api/books")

public class BookController {
	
	private final BookService bookService;
	@Autowired
	public BookController(BookService bookService)
	{
		this.bookService=bookService;
	}
	 public ResponseEntity<String> deleteBook(@PathVariable Long id) {
	        try {
	            bookService.DeleteBookById(id);
	            return ResponseEntity.ok("Book with ID " + id + " has been deleted.");
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(404).body(e.getMessage());
	        }

}
}
