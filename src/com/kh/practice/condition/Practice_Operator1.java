package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_Operator1 {
	public static void main(String [] args) {
		/*
		��� ����� ������ ���� ������������ �Ѵ�. 
		�ο� ���� ���� ������ Ű����� �Է� �ް� 
		1�δ� �����ϰ� �������� ���� ������ 
		�����ְ� ���� ������ ������ ����ϼ���.
		ex.
        �ο� �� : 29
        ���� ���� : 100
        1�δ� ���� ���� : 3
        ���� ���� ���� : 13


		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (candy / people));
		System.out.print("���� ���� ���� : " + (candy % people));
		
		
	}

}
