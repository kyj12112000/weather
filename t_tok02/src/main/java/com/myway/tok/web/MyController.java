package com.myway.tok.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myway.tok.model.TokTok;

@Controller
public class MyController {
	
	//방법 1string 방식 return
	@RequestMapping(value="/my/my_string", method = RequestMethod.GET)
	public String myString(Model model) {
		model.addAttribute("tok", new TokTok("my_String"));
		return "my/my_string";
	}
	
	//방법2 ModelAndView return 방식
	@RequestMapping(value= "/my/my_modelAndView", method = RequestMethod.GET)
	public ModelAndView myString() {
		ModelAndView mav = new ModelAndView();
		//어떤 뷰를 보게 할지 정함
		mav.setViewName("my/my_modelAndView");
		mav.addObject("tok", new TokTok("my_modelAndView"));
		return  mav;
	}
	
	//방법3 void url기반으로 해서 파일을 찾아감 value my폴더에 my_void를 찾아감
	//위에서는 view 모델을 지정해줌 하지만 여기는 안함
	@RequestMapping(value="my/my_void", method = RequestMethod.GET)
	public void myVoid(Model model) {
		model.addAttribute("tok", new TokTok("my_void"));
	}
	
	//방법4 model 자체를 지정여 view page를 넘겨줌 
	//view는 url 패턴을찾아감 model 지정은 필요 없음 model자체를 리턴 해서 이름 지정 x 
	//jsp 페이지에서는 model명을 바로 사용함 
	@RequestMapping(value="my/my_toktok", method = RequestMethod.GET)
	public TokTok myTokTok() {
		return new TokTok("my_toktok");
	}
	
	//방법5 http 본문 바로 자체를 리턴 jsp파일 없이 함
	//크롬에서 tag 먹힘 이클립스 브라우져는 안됨
	//jsp는 생성시 인코딩을 해줌 어떠한 컨텐츠를 가지고 있는지 지정해줘야함
	@RequestMapping(value="/my/my_body", method = RequestMethod.GET)
	@ResponseBody 
	public ResponseEntity<String> myBody() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=UTF-8");
		//jsp 없이 넘기기 때문에 head지정 해서 넘김 
		String html = "<h2>korea</h2> \n <h2>코리아</h2>";
		return new ResponseEntity<String>(html, headers, HttpStatus.OK);
	}
}
