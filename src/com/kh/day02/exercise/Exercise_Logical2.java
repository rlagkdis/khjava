package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 문자 A가 대문자인지 소문자인지 확인하세요
		// A라는 문자는 변수 word에 초기화해주세요
		// 영어 대문자 확인: 대문자면 true
		char word = 'A';
		//아스키코드 대문자A 65부터 Z 90 에끝남
		//65 <= word <= 90
		//'A' <= word <= 'Z'
		boolean result = ('A' <= word) && (word <= 'Z');
	    System.out.println("영어 대문자 확인 : " + result);
	    
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요
		// A라는 문자는 변수 word에 초기화해주세요
		// 영어 대문자 확인: 대문자면 true
	    Scanner sc = new Scanner(System.in);
	    System.out.print("문자를 입력해주세요 : ");
	    char word2 = sc.next().charAt(0);
	    boolean result2 = ('A' <= word2) && (word2 <= 'Z');
	    System.out.println("영어 대문자 확인 : " + result2);
	}

}
