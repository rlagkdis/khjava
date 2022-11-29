package com.kh.day05.Exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {  //실행은안됨
		
		// 누적합     *sum = i + sum;  기억하기
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		for ( int i = 1; i <=10; i++ ) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
			
		public void exercise2() {
			//1 부터 10 까지의 덧셈을 표시하고 합도 구하시오
			// 1+2+3+4+5+6+7+8+9+10=55
			int sum = 0;
			for (int i = 1 ; i <=10 ; i++) {
				sum = i + sum;
				System.out.print(i);
				if (i <= 9 ) {
					System.out.print("+");
				}else {
					System.out.print("=");
				}
			}
			System.out.println(sum);
		}

		public void exercise3() {
			//구구단 출력하기
			for (int i = 1; i < 10; i++) {
				System.out.println("2 * " + i + " = " + 2*i);
			}
		}
		
		public void exercise4() {
			//정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만
			//그 수의 구구단을 출력하세요.
			//단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다"를 출력하세요
			
			//int num; ->전역변수 선언
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if((num > 9) || (num <1)) {
				System.out.print("1~9 사이의 양수를 입력하세요");
			}else {
				for (int i = 1 ; i <=9 ; i++) {
					//num = 0; -> 지역변수 선언
					System.out.println(num + "*" + i + " = " + num*i);
				}
			}
		
			
		}
		
}
