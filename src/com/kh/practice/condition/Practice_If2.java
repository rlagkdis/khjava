package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If2 {
	public static void main(String [] args ) {
		
		//Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		//�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ� 
		//�ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
		//ex.
		//����1 : 4
		//����2 : 11
		//�Է� : 13
		//true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		                                                      
		if (input >= num1 || num2 < input ) {      
			System.out.println("true");            
		}else {                                    
			System.out.println("false");
		}
		
		
	}
	

}
