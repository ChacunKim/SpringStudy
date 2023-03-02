package com.programmers.offline.springStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public String getApple(){
        return "apple";
    }

    public String getTest(){
        return testRepository.testGet();
    }

    public String save(String value) {
        return testRepository.save(value);
    }

    public String search(Long id) {
        return testRepository.search(id);
    }
}
