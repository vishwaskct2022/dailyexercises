package com.dayfour.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayfour.demo.model.Book;
import com.dayfour.demo.repository.BookRepository;




@Service
public class BookService {

	@Autowired
	 BookRepository BookService;
	
	public List<Book> getAllStudents()
	{
		List<Book>studentList=BookService.findAll();
		return studentList;
	}
	public Book saveBook(Book b) {
		return BookService.save(b);
	}

}
}
