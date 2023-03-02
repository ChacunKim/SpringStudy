package com.programmers.offline.springStudy;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository { //저장소(DB)랑 대화

    private Map<String, String> db = new HashMap<>();
    //자바 (자료구조) 컬렉션 중 실무에선 2개만 알면 되어요.
    //list(arraylist), map(hashmap)

    public String test() {
        return "test";
    }
}
