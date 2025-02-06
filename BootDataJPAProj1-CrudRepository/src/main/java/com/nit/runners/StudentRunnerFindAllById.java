package com.nit.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;
//@Component
public class StudentRunnerFindAllById implements CommandLineRunner {
	
	@Autowired
	IStudentMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			List<Integer> list= new ArrayList();
			list.add(1);list.add(2);list.add(952);list.add(null);
			Iterable<Student> l=service.findAllStudentByIds(list);
			for(Student s:l) {
				System.out.println(s);
			}
			//System.out.println("Student list are :"+service.findAllStudentByIds(list));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
