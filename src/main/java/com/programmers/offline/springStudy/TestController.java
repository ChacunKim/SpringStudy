package com.programmers.offline.springStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller //화면 던지기
// 기본: localhost:8080
// 8080: 웹 서버(톰캣) 기본 포트 -> 충돌나서 변경: 8090
// 포트(port) = 주파수
// Tomcat: 웹서버. 스프링부트에 내장됨
@RestController //데이터 던지기. REST API용 Controller
public class TestController {

    @Autowired
    TestService testService;

    //localhost:8090/test
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return testService.getTest(); //RestController 이기 때문에 test.html을 찾아가는 것이 아니라 "test"라는 문자열 데이터를 전송
    }

    //localhost:8090/apple
    @RequestMapping(value = "/apple", method = RequestMethod.GET)
    public String apple(){
        return testService.getApple();
    }
}
