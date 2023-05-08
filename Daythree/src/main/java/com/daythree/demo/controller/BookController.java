package com.daythree.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.daythree.demo.model.Book;
import com.daythree.demo.service.BookService;




@RestController
public class BookController {

	@Autowired
	BookService BookController;
	
	@GetMapping("fetchbook")
	public List<Book> getAllStudents()
	{
		List<Book>studentList=BookController.getAllStudents();
		return studentList;
	}

	@PostMapping("savebook")
	public Book saveStudent(@RequestBody Book b ) {
		return BookController.saveBook(b);
	}
	@PutMapping("/updatebook/{bookid}")
	public  Book updateBook(@RequestBody Book b,@PathVariable("bookid") int bookid)
	{	
		return BookController.updateBook(b,bookid);
	}
	
}
