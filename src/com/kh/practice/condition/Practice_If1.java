package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", 
		//����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "���" : "����� �ƴ�";
		System.out.println(result);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		String result = "";
		
		if (num > 0) {
			result = "���";
		}else {
			result = "����� �ƴ�";
		}
		System.out.println(result);
	}
}
