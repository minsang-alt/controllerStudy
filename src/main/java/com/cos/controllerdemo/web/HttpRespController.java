package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 파일을 리턴할 것이기 때문에
public class HttpRespController {

	@GetMapping("/txt")
	public String txt() {
		return "a.txt"; //프레임워크 사용(틀이 이미 정해져있음)-일반 정적파일들을 resources/static 폴더 내부가 디폴트 경로이다.
	}
	
	@GetMapping("/mus")
	public String mus() {
		return "b"; //머스태치 템플릿 엔진 라이브러리 등록 완료 - templates폴더 안에 .mustache을 나두면 확장지없이 파일명만 적으면
						//자동으로 찾아감.
	}
	
	@GetMapping("/jsp")
	public String jsp() {
		return "c"; //jsp엔진 사용: src/main/webapp 폴더가 디폴트 경로
						// /WEB-INF/views/c.jsp (ViewResolver)
	}
}