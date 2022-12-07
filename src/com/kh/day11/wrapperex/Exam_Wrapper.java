package com.kh.day11.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		int num = 0;
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); 
		char c1 = '4', c2 = 'f';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
