package com.dayfour.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dayfour.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
