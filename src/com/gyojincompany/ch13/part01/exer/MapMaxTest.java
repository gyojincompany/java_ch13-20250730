package com.gyojincompany.ch13.part01.exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("hong", 86);
		map.put("blue", 96);
		map.put("white", 92);
		map.put("red", 99);
		
		String name = null;//최고 점수를 받은 아이디가 저장될 변수
		int maxScore = 0;//최고 점수가 저장될 변수
		int totalScore = 0;//점수의 총합이 저장될 변수
		
		Iterator<Map.Entry<String, Integer>> iter= map.entrySet().iterator(); 
		//키, 값 한쌍에 대해서 iterator 사용
		
//		while(iter.hasNext()) {
//			Map.Entry<String, Integer> entry = iter.next();
//			System.out.println(entry.getKey()); //key값 가져오기
//			System.out.println(entry.getValue()); //value 값 가져오기
//			if(entry.getValue() > maxScore) {
//				maxScore = entry.getValue();
//			}
//		}
//		
//		System.out.println("최고점수 : " + maxScore);
		
		Set<Map.Entry<String, Integer>> entry2 = map.entrySet();
		for(Map.Entry<String, Integer> entry :entry2) {
			System.out.println(entry.getKey()); //key값 가져오기
			System.out.println(entry.getValue()); //value 값 가져오기
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();//key 값->id 값 가져오기
				//마지막으로 if 조건문이 참인 시점->최고값으로 maxScore값이 바뀌는 시점
				//마지막으로 if 조건문이 참인 시점->key값은 maxScore값의 주인인 id값
			}
			totalScore = totalScore + entry.getValue(); //총합 점수
		}
		
		System.out.println("평균점수 : " + (totalScore / map.size()));
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
		
	}

}
