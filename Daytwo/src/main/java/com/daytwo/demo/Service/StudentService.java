package com.daytwo.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daytwo.demo.Model.Student;
import com.daytwo.demo.Repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	StudentRepository studentservice;
	
	public List<Student> getAllStudents()
	{
		List<Student>studentList=studentservice.findAll();
		return studentList;
	}
}
