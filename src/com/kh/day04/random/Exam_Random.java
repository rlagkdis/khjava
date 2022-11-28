package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			//nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴
			//1부터 10까지의 수 중에서 랜덤한 수를 뽑고 싶으면
			//-> nextInt(10)+1, 즉 +1로 범위를 조정한다
			//System.out.println(rand.nextInt(10)+1);
		//System.out.println(rand.nextInt(10));  //0에서 9까지
			
		//ex1. 20부터 35사이의 수 중에서 랜덤한 수를 뽑고 싶다면??
		//nextInt(??) +?? 해야할까요?
		//20부터 35 사이 -> 시작을 0 부터로 만들어야됨
		// 0부터 15사이 -> nextInt()??, ?? = (n-1 = 15)
			//nextInt(16) + 20
			System.out.println(rand.nextInt(16)+20);
			
			//ex2. 10부터 23사이의 수 중에서 랜덤한 수를 뽑고 싶다면??
			//0부터 13사이 -> nextInt(14) + 10
		}
	}

}
