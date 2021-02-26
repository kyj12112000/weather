package com.myway.tok.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myway.tok.model.Student;

//spring에서 관리하는 bean이 됨
@Repository
public class MyBatisDaoImpl implements MyBatisDAO{
	
	@Autowired
	private SqlSession SqlSession;
	
	// StudentMapper.xml에 namesapce 설정해준곳 해당 매퍼를 사용할 경우를 지정해주어야함(구분)
	private static final String NAME_SAPCE = "com.myway.tok.mybatis.MyBatisDAO";
	
	@Override
	public List<Student> findAllStudent() {
		
		//return값을 select id를 설정해주어야함
		return SqlSession.selectList(NAME_SAPCE + ".findAllStudent");
	}

	@Override
	public Student findStudent(Integer seq) {
		// TODO Auto-generated method stub
		return SqlSession.selectOne(NAME_SAPCE +".findStudent");
	}
	

}
