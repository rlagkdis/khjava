package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main (String [] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단수 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i <10 ; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int i = sc.nextInt();
		
		boolean result = (i <= num1) && (num2 < i);
		System.out.println(result);
		
		
		
	}

}
