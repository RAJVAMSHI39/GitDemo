package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.IStudentMgmtService;
//@Component
public class StudentRunnerFindById implements CommandLineRunner {
	@Autowired
	IStudentMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Student with roll no 15 is "+service.findStudentById(15));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
