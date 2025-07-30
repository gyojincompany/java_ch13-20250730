package com.gyojincompany.ch13.part01.settest;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {
	public static void main(String[] args) {
		Set<MemberDto> set = new HashSet<MemberDto>();
		
		MemberDto member1 = new MemberDto("tiger", "12345", "홍길동", 27);
		
		set.add(member1);
		set.add(member1);
		set.add(member1);
		set.add(member1);
		
		System.out.println(set.size()); //1 -> 중복 허용 X
		
		
	}
}
