package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;

import jakarta.annotation.PostConstruct;
//@Component
public class StudentDataInitializer {
	@Autowired
	IStudentMgmtService service;
	
	@PostConstruct
	public void intit() {
		Student s=new Student();
		s.setAddress("America");
		s.setName("Gokul");
		s.setStandard(11);
		try {
			service.insertStudent(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Student count after inserting record "+service.getStudentCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
