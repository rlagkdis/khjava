package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If3 {
	public static void main(String [] args) {
		
		//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		/*
		ex.
		�Է�1 : 5
		�Է�2 : -8
		�Է�3 : 5
		false
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		if ((num1 == num2) && (num2 == num3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}

}
