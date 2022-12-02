package com.kh.day08.run;

import com.kh.day08.oop.Suit;

public class SuitRun {
	public static void main(String[] args) {
		
		//Suit suit = new Suit();			// 기본생성자가 없으므로 실행 오류
		
		Suit suit = new Suit(100);			// 3 → 2 → 1 순으로 출력
		
	}

}
