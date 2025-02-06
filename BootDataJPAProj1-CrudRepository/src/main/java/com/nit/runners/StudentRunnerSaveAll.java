package com.nit.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;
//@Component
public class StudentRunnerSaveAll implements CommandLineRunner {
	@Autowired
	IStudentMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		Student s1=new Student();
		s1.setAddress("Siddipet");s1.setName("Hari");s1.setStandard(8);
		Student s2=new Student();
		s2.setAddress("Abilash");s2.setName("Abilash");s2.setStandard(9);
		Student s3=new Student();
		s3.setAddress("Sircilla");s3.setName("Dathu");s3.setStandard(9);
		List<Student> list=new ArrayList();
		list.add(s1);list.add(s2);list.add(s3);
		try {
			System.out.println(service.groupStudentRegistration(list));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
