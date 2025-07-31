package com.gyojincompany.ch13.part01.exer;

public class MaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//아래 배열 요소 중 최고 점수를 출력하시오. -> 96
		int[] scores = {86, 96, 92};
		
		int maxScore = scores[0];
		//int maxScore = 0;
		
		for(int score : scores) {
			if(score > maxScore) {
				maxScore = score; // 조건이 참->새로 들어온 값이 기존의 maxScore 값보다 크다
			}
		}
		
		System.out.println("최고 점수 : " + maxScore);
		
		
	}

}
