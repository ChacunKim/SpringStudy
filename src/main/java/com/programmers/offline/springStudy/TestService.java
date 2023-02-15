package com.programmers.offline.springStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public String getTest(){
        return testRepository.test();
    }

    public String getApple(){
        return "apple";
    }
}
