package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main (String [] args) {
		//������ �ϳ� �Է¹޾Ƽ� �� ���� 1~9 ������ ���� ����
		//�� ���� �������� ����ϼ���.
		//��, ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���
		
		//int num; ->�������� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if((num > 9) || (num <1)) {
			System.out.print("1~9 ������ ����� �Է��ϼ���");
		}else {
			for (int i = 1 ; i <=9 ; i++) {
				//num = 0; -> �������� ����
				System.out.println(num + "*" + i + " = " + num*i);
			}
		}
		
	}

}
 