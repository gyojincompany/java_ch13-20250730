package com.gyojincompany.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("이름", "홍길동"); //put->데이터 삽입
		map1.put("직업", "개발자"); //put->데이터 삽입
		map1.put("성별", "남자"); //put->데이터 삽입
		map1.put("성별", "여자"); //put->데이터 삽입
		
		System.out.println(map1.get("이름"));
		System.out.println(map1.get("직업"));
		System.out.println(map1.get("성별"));
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 75);
		
		map2.put("강감찬", 85); //강감찬의 점수가 85점으로 수정
		
		
		
	}

}
