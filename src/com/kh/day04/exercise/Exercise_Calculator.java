package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		//연산자 판별 후 연산 수행 그리고 결과 저장
		switch (operator) {
		 case '+' :
			result = num1+num2;
			break;
		 case '-' :
			 result = num1-num2;
			 break;
		 case '*' :
			 result = num1*num2;
			 break;
		 case '/' :
			 result = num1/num2;
			 break;
		 case '%' :
			 result = num1%num2;
			 break;
		}
		System.out.println("결과 : " + num1 + operator + num2 + "=" + result);
		//앞에 "결과 : " 가없으면 결과 다르게나옴
		////num1 + " " + operator + " " + num2
		// 삭제 단축키 : ctrl +d  

		
	}

}
