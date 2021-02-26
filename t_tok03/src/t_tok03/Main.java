package t_tok03;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Main {
	public static void main(String[] args) throws IOException {
//		select();
		selectMapper();
	
	}
	
	public static void selectMapper() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("t_tok03/mybatis-config.xml");
		SqlSessionFactory sqlSessiongFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessiongFactory.openSession();
		//mybatis의 설정에 넣고 mybatis 통해서 관리 
		session.getConfiguration().addMapper(StudentMapper.class); //사용할 mapper 추가
		
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectStudent();
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		
	}
	
	public static void select() throws IOException {
		Reader reader = Resources.getResourceAsReader("t_tok03/mybatis-config.xml");
		SqlSessionFactory sqlSessiongFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessiongFactory.openSession();
		
		List<Student> list = session.selectList("Student.findAllStudent");
		
		System.out.println(list.size());
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
