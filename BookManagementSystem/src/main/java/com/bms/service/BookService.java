package com.bms.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.bms.entity.Book;

@Service
public interface BookService {
	Book addBook(Book b);//created method to add book
	List<Book> getAllBookDetails();//method to get all the details of book
	Book getBookById(int id);//method to get book by id
	Book updateBook(int id,Book book);//method to update the details of book
	String deleteBook(int id);//method to delete book
	List<Book> getBookByPrice(double price);//method to get book by price
	List<Book> getBookByName(String name);//method to get book by name
}
