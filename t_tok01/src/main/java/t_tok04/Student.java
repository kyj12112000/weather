package t_tok04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//어노테이션으로 라이프사이클관리
	@PostConstruct
	public void postConstruct() {
		if("스프링".equals(name)) {
			System.out.println(name + "은 열심히한다");
		} else {
			System.out.println(name +" 은 몇살?");
		}
	}
	
	@PreDestroy
	public void preDestroy() {
		if("스프링".equals(name)) {
			System.out.println("감사합니다 열심히 하겠씁니다");
		}else {
			System.out.println("나이는 비밀");
		}
	}
	
	//초기화 메소드
	public void init() {
		System.out.println(name + "은 학생인가요?");
	}
	public void cleanUp() {
		System.out.println("아닙니다");
	}
	//소멸 메소드

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean이 소멸 될때 호출, 자원 반납부분");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean이 생성될때 호출 DI 이후 초기화 부분이 있으면 여기서 진행");
		
	}
	
}
