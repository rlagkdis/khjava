package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���
		// ������ �Է����ּ��� : 11
		// ������ �ѹ� �� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11
		
		// 1. �����ϳ� �Է¹���
		// 2. �����ϳ� �� �Է¹���
		// 3. ������ �Է¹���
		// 4. ������ �Ǻ� �� ���� ���� �� ��� ����
		// 5. ��� ���
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("���� �ѹ� �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("������ �Է�(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		if (operator == '+') {
			result = num1+num2;                          // ���� ���� ����
		}else if (operator == '-') {
			result = num1-num2;                           // ���� ���� ����
		}else if (operator == '*') {
			 result = num1*num2;                          // ���� ���� ����
		}else if (operator == '/') {
			result = num1/num2;                          // ������ ���� ����
		}else if (operator == '%') {
			 result = num1%num2;                          // ������ ���� ����
		}
		
		System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = "  + result);
		
	}

}
