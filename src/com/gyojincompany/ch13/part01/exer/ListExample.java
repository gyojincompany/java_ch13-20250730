package com.gyojincompany.ch13.part01.exer;

import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		List<Board> boardList = dao.getBoardDao();
		
		Iterator<Board> iterator = boardList.iterator();
		while(iterator.hasNext()) {
			Board board = iterator.next();
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
		
	}

}
