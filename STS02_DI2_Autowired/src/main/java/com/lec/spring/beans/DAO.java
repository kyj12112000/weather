package com.lec.spring.beans;

public class DAO {
	String uid;

	
	public DAO() {
		System.out.println("DAO()실행");
	}


	public DAO(String uid) {
		super();
		System.out.printf("DAO(%s) 생성\n", uid);
		this.uid = uid;
	}


	@Override
	public String toString() {
		return String.format("[DAO: %s", this.uid);
	}
	
	

}
