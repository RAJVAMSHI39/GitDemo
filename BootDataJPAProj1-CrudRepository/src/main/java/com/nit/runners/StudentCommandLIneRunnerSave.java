package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;
//@Component
public class StudentCommandLIneRunnerSave implements CommandLineRunner {
	@Autowired
	IStudentMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		Student s=new Student();
		s.setAddress("Madhapur");
		s.setName("Venkat");
		s.setStandard(11);
		try {
			service.insertStudent(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Student Record count :"+service.getStudentCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
