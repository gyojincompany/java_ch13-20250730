package com.gyojincompany.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("직업", "개발자");
		map.put("직장", "서울자동차");
		
		Iterator<String> iter = map.keySet().iterator(); //key에 대해서 iterator 사용
		
		while(iter.hasNext()) {
			String key = iter.next(); //key를 추출
			System.out.println(map.get(key)); //key값을 이용하여 value 가져오기
		}
		
		System.out.println("============================");
		
		Iterator<Map.Entry<String, String>> iter2= map.entrySet().iterator(); 
		//키, 값 한쌍에 대해서 iterator 사용
		
		while(iter2.hasNext()) {
			Map.Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey()); //key값 가져오기
			System.out.println(entry.getValue()); //value 값 가져오기
		}
		
		
		
		
	}

}
