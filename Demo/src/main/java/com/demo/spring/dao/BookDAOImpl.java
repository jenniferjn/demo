package com.demo.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.model.Book;

@Repository
public class BookDAOImpl implements BookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public long save(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
