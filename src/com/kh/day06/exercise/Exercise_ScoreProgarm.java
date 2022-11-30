package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgarm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		ESCAPE :
		//boolean exit = true;  
		while (true) {
			
			System.out.println("======메인 메뉴======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			int i = 0;
			switch (choice) {
			case 1 : 
				System.out.println("======성적 입력======");
				System.out.print("국어 : " );
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 :
				System.out.println("======성적 출력=======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				int sum = kor+eng+math;
				double avg = (double)sum / 3;
				
				System.out.println("총점 : " + sum);
				//System.out.println("평균 : " + avg);
				System.out.printf("평균 : %.2f \n", avg); //%2f 에서 소수점표시 %.2f
				break;
			case 3 :
				System.out.println("Good Bye~");
				//exit = false;
				break ESCAPE;
			default :  //case 1,2,3 외의 다른수들일때
				System.out.println("1~3사이의 수를 입력해주세요~");
				break;
		}
		} 
		

	}

}
