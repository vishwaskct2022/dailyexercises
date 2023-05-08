package com.daythree.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daythree.demo.model.Book;
import com.daythree.demo.repository.BookRepository;



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
	public  Book updateBook(Book b,int bookid) {
		Optional<Book> optional=BookService.findById(bookid);
		Book obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setBookid(b.getBookid());
			obj.setBookname(b.getBookname());
			obj.setAuthor(b.getAuthor());
			obj.setPrice(b.getPrice());
		BookService.saveAndFlush(b);
		}
		return obj;
	}

}
