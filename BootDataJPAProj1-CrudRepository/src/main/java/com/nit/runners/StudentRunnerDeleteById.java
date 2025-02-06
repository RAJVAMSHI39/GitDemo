package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.IStudentMgmtService;
@Component
public class StudentRunnerDeleteById implements CommandLineRunner {
	@Autowired
	private IStudentMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			service.deleteStudentByid(3);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
