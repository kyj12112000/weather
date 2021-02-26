package com.lec.spring;

public class MessageKor implements MessageBean{
	String msgKor = "안녕하세요";

	public MessageKor() {
		System.out.println("msgkor 생성");
	}

	public void sayHello() {
		System.out.println(msgKor);
		
	}
	
	
	

}
