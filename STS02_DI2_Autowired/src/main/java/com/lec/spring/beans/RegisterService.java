package com.lec.spring.beans;

public class RegisterService implements Service{
	DAO dao;

	public RegisterService(DAO dao) {
		System.out.printf("RegisterServcie(%s)생성\n", dao.toString());
		this.dao = dao;
	}

	@Override
	public String toString() {
		return String.format("RegisterService : %s]", dao.toString());
	}
	
	
	
	
}
