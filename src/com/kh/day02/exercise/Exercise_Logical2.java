package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// ���� A�� �빮������ �ҹ������� Ȯ���ϼ���
		// A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���
		// ���� �빮�� Ȯ��: �빮�ڸ� true
		char word = 'A';
		//�ƽ�Ű�ڵ� �빮��A 65���� Z 90 ������
		//65 <= word <= 90
		//'A' <= word <= 'Z'
		boolean result = ('A' <= word) && (word <= 'Z');
	    System.out.println("���� �빮�� Ȯ�� : " + result);
	    
		// �Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���
		// A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���
		// ���� �빮�� Ȯ��: �빮�ڸ� true
	    Scanner sc = new Scanner(System.in);
	    System.out.print("���ڸ� �Է����ּ��� : ");
	    char word2 = sc.next().charAt(0);
	    boolean result2 = ('A' <= word2) && (word2 <= 'Z');
	    System.out.println("���� �빮�� Ȯ�� : " + result2);
	}

}
