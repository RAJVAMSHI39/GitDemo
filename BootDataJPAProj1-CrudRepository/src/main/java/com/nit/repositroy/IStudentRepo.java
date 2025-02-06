package com.nit.repositroy;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
/*
https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
*/