package com.nit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repositroy.IStudentRepo;
@Service
public class StudentMgmtServiceImp implements IStudentMgmtService {
	@Autowired
	IStudentRepo student;
	
	@Override
	public void insertStudent(Student s) {
		//System.out.println("Inmemoryproxy class: "+student.getClass()+": "+Arrays.toString(student.getClass().getInterfaces()));
		System.out.println("Before saving "+s);
		Student ss=student.save(s);
		System.out.println("After saving "+s+" with rollNo"+s.getRollNo());
	}

	@Override
	public long getStudentCount() {
		return student.count();
	}
	
	@Override
	public boolean checkMovieById(Integer id) {
		return student.existsById(id);
	}

	@Override
	public Iterable<Student> findAllStudent() {
		return student.findAll();
	}
	
	@Override
	public Iterable<Student> findAllStudentByIds(List<Integer> sid) {
		return student.findAllById(sid);
	}
	
	@Override
	public Student findStudentById(Integer sid) {
	/*	Optional<Student> st=student.findById(sid); 
		if(st.isPresent())
			return st.get();
		else
			throw new IllegalArgumentException("Student record not found");*/
		
		return student.findById(sid).orElseThrow(()->new IllegalArgumentException("Student not found"));
		
		//return student.findById(sid).orElse(new Student());
	}
	
	@Override
	public String groupStudentRegistration(List<Student> studlist) {
		Iterable<Student> savedStudents=student.saveAll(studlist);
		List<Integer> rollNos=new ArrayList<Integer>();
		if(savedStudents!=null&&((List<Student>) savedStudents).size()>0) {
			savedStudents.forEach(m->{
			    rollNos.add(m.getRollNo());
			});
		}
		return rollNos+" students are registered";
	}
	
	@Override
	public void deleteStudentByid(Integer id) {
		System.out.println("Deleting student record with id "+id);
		student.deleteById(id);
	}
}
