package com.nit.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;
//@Component
public class StudentRunnerFindAll implements CommandLineRunner {

	@Autowired
	IStudentMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			Iterable<Student> list=service.findAllStudent();
			for(Student student:list) {//enchancer for loop
				System.out.println(student);
			}
			System.out.println("====================");
			list.forEach(movie->System.out.println(movie));//for each() method
			System.out.println("===========");
			list.forEach(System.out::println);// for each method +static method reference
			System.out.println("==========");
			Arrays.asList(list).stream().forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
