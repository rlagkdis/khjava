package com.kh.day05.Exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {  //�������ȵ�
		
		// ������     *sum = i + sum;  ����ϱ�
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		for ( int i = 1; i <=10; i++ ) {
			sum = i + sum;
		}
		System.out.println("1���� 10������ �� : " + sum);
	}
			
		public void exercise2() {
			//1 ���� 10 ������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
			// 1+2+3+4+5+6+7+8+9+10=55
			int sum = 0;
			for (int i = 1 ; i <=10 ; i++) {
				sum = i + sum;
				System.out.print(i);
				if (i <= 9 ) {
					System.out.print("+");
				}else {
					System.out.print("=");
				}
			}
			System.out.println(sum);
		}

		public void exercise3() {
			//������ ����ϱ�
			for (int i = 1; i < 10; i++) {
				System.out.println("2 * " + i + " = " + 2*i);
			}
		}
		
		public void exercise4() {
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
