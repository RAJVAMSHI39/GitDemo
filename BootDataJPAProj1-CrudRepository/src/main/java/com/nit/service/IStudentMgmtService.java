package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentMgmtService {
	void insertStudent(Student s);
	long getStudentCount();
	boolean checkMovieById(Integer id);
	Iterable<Student> findAllStudent();
	Iterable<Student> findAllStudentByIds(List<Integer> sid);
	Student findStudentById(Integer sid);
	String groupStudentRegistration(List<Student> studlist);
	void deleteStudentByid(Integer id);
}
