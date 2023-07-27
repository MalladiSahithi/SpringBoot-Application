package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.entity.Book;
import com.bms.service.BookService; 
@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("/createbook")
	ResponseEntity<Book> addBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.CREATED);
	}
	@GetMapping("/getallbooks")
	ResponseEntity<Book> getAllBookDetails()
	{
		return new ResponseEntity<Book>(HttpStatus.OK);
		
	}
	@GetMapping("/getbookbyid")
	ResponseEntity<Book> getBookById(@PathVariable int id){
		return new ResponseEntity<Book>(bookService.getBookById(id),HttpStatus.OK);
	}
	@PutMapping("/updatebook")
	ResponseEntity<Book> updateBook(@RequestBody int id,@PathVariable Book book){
		return new ResponseEntity<Book>(bookService.updateBook(id, book),HttpStatus.OK);
	}
	@DeleteMapping("/deletebook")
	ResponseEntity<Book> deleteBook(@PathVariable int id){
		return new ResponseEntity<Book>(HttpStatus.OK);
	}
	@GetMapping("/getbookbyprice")
	ResponseEntity<Book> getBookByPrice(@PathVariable double price){
		return new ResponseEntity<Book>(HttpStatus.OK);
	}
	@GetMapping("/getbookbyname")
	ResponseEntity<Book> getBookByName(@PathVariable String name){
		return new ResponseEntity<Book>(HttpStatus.OK);
	}
}
