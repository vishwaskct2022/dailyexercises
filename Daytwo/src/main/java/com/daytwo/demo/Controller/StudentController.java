package com.daytwo.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daytwo.demo.Model.Student;
import com.daytwo.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService StudentController;
	
	@GetMapping("fetchstudent/{Studentid}")
	public List<Student> getAllStudents()
	{
		List<Student>studentList=StudentController.getAllStudents();
		return studentList;
	}
	
}
