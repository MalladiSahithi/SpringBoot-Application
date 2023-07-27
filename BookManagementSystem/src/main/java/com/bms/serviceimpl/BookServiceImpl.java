package com.bms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.entity.Book;
import com.bms.repository.BookRepository;
import com.bms.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository bookRepository;
	@Override
	public Book addBook(Book b) {

		return bookRepository.save(b);
	}

	@Override
	public List<Book> getAllBookDetails() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {
		
		return bookRepository.findById(id).get();
	}

	@Override
	public Book updateBook(int id, Book book) {
		Book b=bookRepository.findById(id).get();
		b.setName(b.getName());
		b.setPrice(b.getPrice());
		b.setAuthor(b.getAuthor());
		Book b1=bookRepository.save(b);
		return b1;
	}

	@Override
	public String deleteBook(int id) {
		bookRepository.deleteById(id);
		return "Successfully deleted book by id";
	}

	@Override
	public List<Book> getBookByPrice(double price) {
		
		return bookRepository.findBookByPrice(price);
	}

	@Override
	public List<Book> getBookByName(String name) {
		
		return bookRepository.findBookByName(name);
	}

}
