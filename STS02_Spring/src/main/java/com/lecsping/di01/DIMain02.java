package com.lecsping.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lec.spring.MessageBean;

public class DIMain02 {

	public static void main(String[] args) {
		
		String configLocation = "classpath:appCtx.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MessageBean msg = ctx.getBean("messageBean", MessageBean.class);
		msg.sayHello();
		

	}

}
