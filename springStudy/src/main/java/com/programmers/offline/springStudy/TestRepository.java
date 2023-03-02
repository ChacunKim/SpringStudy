package com.programmers.offline.springStudy;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {

    /*
      - map은 key value로 테이블 구조와 같다.
      - 요청을 key로 하면 key에 맵핑된 value로 응답!
      - Map이란? key-value 쌍으로 이루어진 자료 구조
      - 실무에서 DB 대신 왜 Map을 사용?? >> 결제가 이루어지기까지 시간이 소요됨.
      >> DB없이 시작, 갈아끼워야함.
      - 그럼 repository 코드를 모두 다시 짜야 함.
      - 객체 지향의 5원칙: SOLID: Repository 를 모두 고치는건 ok지만 다른 클래스에 영향이 없어야 함.
      - Repository 가 바뀌는 바람에, 메소드 명이 달라지면 Service, Controller 가 바뀌어야 함.
      - 그럼 메소드 이름 막 바뀌면 어떻게해!! ->> 인 터 페 이 스!
    */
    Map<Long, String> db = new HashMap<Long, String>();
    Long id = 1L;
    // 실무에서는 Long 대신에 AtomicLong 많이 씀.
    // ConcurrentHashMap<>()으로 씀

    /*
    * test() 메소드가 불리면
    * db에서 "test" 글자를 찾아서 반환해주세요.
    *
    * 실습! 스스로 먼저 해보기
    * 1. db에 데이터를 삽입하는 메소드. save  ->>put
    *   : 키는 1, 값은 "test"
    * 2. 그래서 test 메소드는 key값을 가지고 "test"를 뽑아서 return 자리를 대체해주세요. ->>get
    *
    * Map 에 사용하는 메소드 put과 get
    * JS의 Map 아주 기능 많다. 생각 확장!
    * */

    public void testSave(){
        db.put(1L, "test");
    }

    public String testGet(){
        return db.get(1L);

    }

    public String save(String value){
        db.put(id, value);
        return db.get(id++);
    }

    public String search(Long id) {
        return db.get(id);
    }
}
