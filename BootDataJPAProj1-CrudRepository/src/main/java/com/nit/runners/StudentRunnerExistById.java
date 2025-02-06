package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nit.service.IStudentMgmtService;
//@Component
public class StudentRunnerExistById implements ApplicationRunner {
	@Autowired
	IStudentMgmtService service;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		for(String obj:args.getNonOptionArgs()) {
			Integer id=Integer.parseInt(obj);
			System.out.println("Is record available with id: "+id+"="+service.checkMovieById(id));
		}
	}

}
