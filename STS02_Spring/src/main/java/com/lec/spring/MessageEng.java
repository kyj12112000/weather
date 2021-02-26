package com.lec.spring;

public class MessageEng implements MessageBean{
	String myEng = "Good Morning";

	public MessageEng() {
		System.out.println("megEng 생성");
	}

	public void sayHello() {
		System.out.println(myEng);
		
	}
	
	
}
