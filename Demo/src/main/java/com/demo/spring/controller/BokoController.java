package com.demo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.model.Book;
import com.demo.spring.service.BookService;

@RestController
public class BokoController {

	@Autowired
	private BookService bookService;
	
	//Get All Books
	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list() {
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
	
	public BokoController() {
		// TODO Auto-generated constructor stub
	}

}
