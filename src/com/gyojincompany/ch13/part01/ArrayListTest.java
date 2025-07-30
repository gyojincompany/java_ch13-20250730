package com.gyojincompany.ch13.part01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		
		strList.add("Kor");
		strList.add("Jap");
		strList.add(1, "USA");
		
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		
		System.out.println("=====================================");
		
		strList.remove(1); //USA 인덱스 1 -> 삭제
		
		System.out.println(strList.get(0)); //Kor
		System.out.println(strList.get(1)); //Jap
		// System.out.println(strList.get(2)); //out of bounds 에러 발생
		
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i)); 
		}
		
		System.out.println("===================================");
		
		//향상된 for문
		for(String str : strList) {
			System.out.println(str); 
		}
		
		System.out.println("===================================");
		
		//Iterator 사용
		Iterator<String> iterator = strList.iterator(); //iterator 생성
		
		while(iterator.hasNext()) {
			String str = iterator.next();			
			System.out.println(str);
		}
		
		
	}

}
