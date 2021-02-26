package t_tok01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main2(String[] args) {
		HellowWorld hello = new HellowWorld();
		hello.setMessage("hellow world");
		System.out.println(hello.getMessage());
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HellowWorld hello = (HellowWorld)context.getBean("helloWorld");
		System.out.println(hello.getMessage());
	}
}
