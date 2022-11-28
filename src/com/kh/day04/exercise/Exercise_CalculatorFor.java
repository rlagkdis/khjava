package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(;;) {  //무한 반복
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
			count ++; //출력에 성공했을 때 카운트 업
			if(count ==3) break;
			//break; //무한반복 끝남
		}
		  
	}

}
