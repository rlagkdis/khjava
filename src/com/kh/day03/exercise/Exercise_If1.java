package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// �����ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		String result = "";   // �ʱ�ȭ���ִ°�

		if (num == 0) {
			result = "0";
		} else if (num > 0) {
			result = "���� ����";
		} else {
			result = "���� ����";   // indent ����: ctrl + shift = f  >�鿩���� ��������
		}
        System.out.println(result + "�Դϴ�.");
        
	
	}

}
