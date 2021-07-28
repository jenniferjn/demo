package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.model.Book;

public interface BookDAO {
	
	//Save Record
	long save(Book book);
	
	
	//Get Single Record
	Book get(long id);
	
	//Get All Records
	List<Book> list();
	
	
	//Update Record
	void update(long id, Book book);
	
	
	//Delete Record
	void delete(long id);

}
