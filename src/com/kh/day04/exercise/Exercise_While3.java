package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main(String [] args) {
		//while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� 
		//-1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		//���� �ϳ� �Է� : 3
		//���� �ϳ� �Է� : 4
		//���� �ϳ� �Է� : 7
		//���� �ϳ� �Է� : -1
		//�Է��Ͻ� ���� ���� : 14

		Scanner sc = new Scanner(System.in);
		//System.out.print("���� �ϳ� �Է� : ");
		//int input = sc.nextInt();
		int input = 0;
		int sum = 0;
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			input = sc.nextInt();
			//�Է��� ���� ���ϰ�, �Է��� ���� -1 �̸� ���ѹݺ� ����������
			if(input == -1) break;
			sum += input;
			
		}
		
		/*
		 * while (input != -1) {  //num�� -1�� �ƴϸ� true -> -1�� �ԷµǱ� ������ ����.
			System.out.print("���� �ϳ� �Է� : ");
			input = sc.nextInt();
			if(input != -1) {  //-1�� ������ �ʱ����ؼ�
				sum += input;  //sum = sum + input
			}
		}	
		 */
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
		
	}

}
