package com.programmers.offline.springStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller //화면 던지기
// 기본: localhost:8080
// 8080: 웹 서버(톰캣) 기본 포트 -> 충돌나서 변경: 8090
// 포트(port) = 주파수
// Tomcat: 웹서버. 스프링부트에 내장됨
@RestController //데이터 던지기. REST API용 Controller
public class TestController {

    @Autowired // 의존성 주입. 스프링 IoC 컨테이너에서 빈을 꺼내서 넣어준다.-> 생성자로 대체 가능
    TestService testService;

    /*
    public TestController(TestService ts){
        this.testService = ts;
    }*/

    //localhost:8090/apple
    @RequestMapping(value = "/apple", method = RequestMethod.GET)
    public String apple(){
        return testService.getApple();
    }

    //localhost:8090/test
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return testService.getTest(); //RestController 이기 때문에 test.html을 찾아가는 것이 아니라 "test"라는 문자열 데이터를 전송
    }


    //localhost:8090/save?value=????
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@RequestParam("value") String value){
        return testService.save(value);
    }

    //localhost:8090/search?id=1
    @RequestMapping(value = ("/search"), method = RequestMethod.GET)
    public String search(@RequestParam("id") Long id){
        return testService.search(id);
    }

}
