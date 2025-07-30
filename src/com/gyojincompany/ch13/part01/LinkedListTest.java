package com.gyojincompany.ch13.part01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new LinkedList<Board>();
		
		Date nowDate = new Date();
		
		Board board = new Board("강감찬", "안녕하세요.", "안녕하세요 첫 글입니다.", new Timestamp(nowDate.getTime()));
		
		long startTime; //작업 시작 시간
		long endTime; //작업 종료 시간		
		
		//ArrayList 작업 시간 측정
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) { //10000번 board 객체 삽입
			list1.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 작업시간: " +  (endTime - startTime));
		
		//LinkedList 작업 시간 측정
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) { //10000번 board 객체 삽입
			list2.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 작업시간: " +  (endTime - startTime));
		
		
	}

}
