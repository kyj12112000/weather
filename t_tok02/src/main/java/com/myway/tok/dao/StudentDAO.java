package com.myway.tok.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.myway.tok.mapper.StudentMapper;
import com.myway.tok.model.Student;

@Component
public class StudentDAO {
	private JdbcTemplate jdbcTemplate;
	
	//자동주입
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	public void create(Student student) {
		String sql = "INSERT INTO Student(id, name, age) values(?, ?, ?)";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAge());
	}
	
	//학생 조회 메소드 -리스트 형
	public List<Student> select() {
		String sql = "SELECT * FROM Student";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		
		return students;
	}
	
	// 학생 단건 조회
	public Student select(Integer seq) {
		String sql = "SELECT * FROM Student WHERE seq = ?";
		//2번째에 받을 seq 받음 object로 배열형태로 받야아함
		Student students = jdbcTemplate.queryForObject(sql, new Object[] {seq},new StudentMapper());
		
		return students;
	}
	
	//학생 수정 메소드
	public void update(Student student) {
		String sql = "UPDATE Student SET id=?, name=?, age=? WHERE seq=?";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAge(), student.getSeq());
	}
	//학생 삭제 메소드
	public Integer delete(Integer seq) {
		String sql = "DELETE FROM Student WHERE seq =?";
		return jdbcTemplate.update(sql, seq);
		
	}
	
	//학생 입력 후 에러가 발생하는 학생 수정을 호춯하는 상황
	//Transactionl 메소드 안에서 하는 작업은 전부 1개 처리로 함 1개라도 에러가 있을시 전체 실행 x
	@Transactional
	public void sampleTransaction(Student student) {
		this.create(student);
		this.update(student);
	}
}
