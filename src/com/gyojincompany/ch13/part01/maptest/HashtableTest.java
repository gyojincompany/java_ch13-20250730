package com.gyojincompany.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로그인 과정 구현
public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tiger", "12345"); //id, pw
		map.put("lion", "88888"); //id, pw
		map.put("blackcat", "99999"); //id, pw
		map.put("whitedog", "77777"); //id, pw
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String pw = scanner.nextLine();
			
			System.out.println("===========================");
			
			if(map.containsKey(id)) { //containsKey 키값들중에 일치여부 확인 메소드
			//map에 들어 있는 데이터의 key값들 중에 id값과 일치하는 값이 존재하면 true 반환 
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					break;
				} else { //id 값은 존재하나 해당 id의 비번이 틀림
					System.out.println("비밀번호를 잘못 입력하셨습니다!");
				}
			} else {
				System.out.println("입력하신 ID가 존재하지 않습니다!");
			}
			
		}
		
		
		
	}

}
