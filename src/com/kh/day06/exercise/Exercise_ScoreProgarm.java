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
			
			System.out.println("======���� �޴�======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			int i = 0;
			switch (choice) {
			case 1 : 
				System.out.println("======���� �Է�======");
				System.out.print("���� : " );
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;
			case 2 :
				System.out.println("======���� ���=======");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				int sum = kor+eng+math;
				double avg = (double)sum / 3;
				
				System.out.println("���� : " + sum);
				//System.out.println("��� : " + avg);
				System.out.printf("��� : %.2f \n", avg); //%2f ���� �Ҽ���ǥ�� %.2f
				break;
			case 3 :
				System.out.println("Good Bye~");
				//exit = false;
				break ESCAPE;
			default :  //case 1,2,3 ���� �ٸ������϶�
				System.out.println("1~3������ ���� �Է����ּ���~");
				break;
		}
		} 
		

	}

}
