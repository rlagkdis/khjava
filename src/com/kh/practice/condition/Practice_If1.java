package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main (String [] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단수 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i <10 ; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		*/
		
		//키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수" : "양수가 아님";
		System.out.println(result);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = "";
		
		if (num > 0) {
			result = "양수";
		}else {
			result = "양수가 아님";
		}
		System.out.println(result);
	}

}
