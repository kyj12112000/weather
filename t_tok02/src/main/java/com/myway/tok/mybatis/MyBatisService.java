package com.myway.tok.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.tok.model.Student;

@Service
public class MyBatisService {
	
	@Autowired
	private MyBatisDAO myBatisDao;
	
	public List<Student> findAllStudent(){
		
		return myBatisDao.findAllStudent();
		
	}
}
