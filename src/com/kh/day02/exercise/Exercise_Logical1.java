package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// 50�� 1~100 ������ �������� Ȯ���ϼ���
		// 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		// 1���� 100������ �����ΰ�? : true
		int num = 50;
		boolean result = (1 < num) && (num< 100);
		System.out.println("1���� 100������ �����ΰ�? : " + result);
		
		
		// �Է��� ������ 1~100 ������ �������� Ȯ���ϼ���
		// 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
	    // 1���� 100������ �����ΰ�? : true
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int num2 = sc.nextInt();
		boolean result2 = (1 < num2) && (num2< 100);
		System.out.println("1���� 100������ �����ΰ�? : " + result2);
		
	
	}

}
