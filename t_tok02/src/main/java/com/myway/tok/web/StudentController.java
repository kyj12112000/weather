package com.myway.tok.web;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myway.tok.dao.StudentDAO;
import com.myway.tok.model.Student;

@Controller
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class); 
	
	@Autowired
	private StudentDAO studentDAO;
	
	//방법1. return 값을 String 형으로 만들어 주고, Model을 따로 장착 시키는 방법
	// - return은 view의 이름을 명시해주고, view에서 사용될 model은 따로 주입을 하는 방법
	
	@RequestMapping(value="/student01.do", method=RequestMethod.GET)
	public String student01(Model model) {
		model.addAttribute("student", new Student());
		return "student/student";
	}
	
	//방법2. ModelAndView 활용
	@RequestMapping(value="/student02.do", method=RequestMethod.GET)
	public ModelAndView student02() {
		
		return new ModelAndView("student/student","student", new Student());
	}
	
	//jsp에서 commandName으로 지정 해줌 student
	
	//sutdent.jsp의 요청에서 입력값을 받아서 result.jsp로 전달
	@RequestMapping(value="/add/student.do", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student, Model model) {
		model.addAttribute("student", student);
		//db 학생 객체 DB 입력
		studentDAO.create(student);
//		studentDAO.sampleTransaction(student);
		
		return "redirect:/student_list.do";
	}
	
	//student 조회 요청
	@RequestMapping(value="/student_list.do", method = RequestMethod.GET)
	public String getStudents(Model model, 
			@RequestParam(value="seq", required = false, defaultValue = "0")Integer seq) {
		if(seq ==0) {
			List<Student> students = studentDAO.select();
			model.addAttribute("students", students);
			return "student/list";
		} else {
			// 학생 단건 조회
			model.addAttribute("student", studentDAO.select(seq));
			return "student/result";
		}
	}
	
	//student 삭제 요청 required 필수사항
	@RequestMapping(value="/student_delete.do", method= RequestMethod.GET)
	public String delete(@RequestParam(value="seq", required = true) Integer seq) {
		studentDAO.delete(seq);
		//redirect는 컨트롤러 맵핑을 요청하는것임
		return "redirect:/student_list.do";
	}
	
	//student 수정 페이지 이동 요청
	@RequestMapping(value="/move_update.do", method = RequestMethod.GET)
	public String moveUpdate(Model model,@RequestParam(value="seq", required = true) Integer seq) {
		model.addAttribute("student", studentDAO.select(seq));
		return "student/student";
	}
	@RequestMapping(value="/update/student.do", method = RequestMethod.POST)
	public String update(@ModelAttribute Student student) {
		studentDAO.update(student);
		//나의 수정된 화면 보여짐
		return "redirect:/student_list.do?seq="+student.getSeq();
	}
}
