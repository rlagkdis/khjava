package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_Calculator2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("정수를 하나 더 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자(+,-,*,/,%)를 입력하세요 : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		switch (operator) {
		 case '+':
			 result = num1 + num2;
			 break;
		 case '-':
			 result = num1 - num2;
			 break;
		 case '*':
			 result = num1 * num2;
			 break;
		 case '/':
			 result = num1 / num2;
			 break;
		 case '%':
			 result = num1 % num2;
			 break;	 
		}
		System.out.println("결과 : " + num1 + operator + num2 + "=" + result );
		
	}

}
