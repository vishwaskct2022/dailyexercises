package com.dayfour.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dayfour.demo.model.Book;
import com.dayfour.demo.service.BookService;


public class BookController {

	@Autowired
	BookService BookController;
	
	@GetMapping("fetchbooks/{bookid}")
	public List<Book> getAllStudents()
	{
		List<Book>studentList=BookController.getAllStudents();
		return studentList;
	}

	@PostMapping("savebook")
	public Book saveStudent(@RequestBody Book b ) {
		return BookController.saveBook(b);
	}
}
