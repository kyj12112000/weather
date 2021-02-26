package com.lecsping.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lec.spring.Score;

public class DIMain03 {
	
	public static void main(String[] args) {
		
		System.out.println("Main 시작 ---");
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:scoreCtx.xml");
		System.out.println(ctx);
		System.out.println("컨테이너 생성\n");
		Score score = null;
		
		score = (Score) ctx.getBean("myScore2");
		System.out.println(score);
		System.out.println("생성된 빈의 개수" + ctx.getBeanDefinitionCount());
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name + "  " +ctx.getBean(name));
		}
		ctx.close();
		System.out.println("Main 종료");
		
	}
	
	
	
	
	
	
	
}
