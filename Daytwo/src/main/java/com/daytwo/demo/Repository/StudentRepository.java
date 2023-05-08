package com.daytwo.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daytwo.demo.Model.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
