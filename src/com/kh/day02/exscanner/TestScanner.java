package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		//Scanner ���ڿ��� ctrl+space 
		
		System.out.print("int ���� �Է����ּ��� : "); //���̵� �޽��� �Ⱦ��� �ƹ��͵� �ȶ� ������ �Ǵµ� 
		int input1 = sc.nextInt();
		System.out.println("�Է��� �� : " + input1); // println (ln)�Ⱥ��̸� �ٷ� ���� ���̸� ������ �Ѿ
		
		System.out.print("int ���� �ѹ� �� �Է����ּ��� : ");
		int input2 = sc.nextInt();
		System.out.println("�Է��� �� : " + input2);
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� : " + result + "�Դϴ�.");
		//sc.close();
		
		
		
		
		
		
		
	}

}
