package com.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.nit.entity.Student;
import com.nit.repositroy.IStudentRepo;

@SpringBootApplication
public class BootDataJpaProj1CrudRepositoryApplication {

	//@Bean
	public CommandLineRunner createCLR(IStudentRepo st) {
		return args->{
			Student s=new Student();
			s.setName("Soujanya");
			s.setAddress("Hitech city");
			s.setStandard(10);
			st.save(s);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
	}

}
