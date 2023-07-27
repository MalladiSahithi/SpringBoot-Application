package com.bms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
	
	List<Book> findBookByPrice(double price);
	List<Book> findBookByName(String name);
}
