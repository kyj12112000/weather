package com.myway.tok.mybatis;

import java.util.List;

import com.myway.tok.model.Student;

public interface MyBatisDAO {
	
	public List<Student> findAllStudent();
	
	public Student findStudent(Integer seq);
	
}
