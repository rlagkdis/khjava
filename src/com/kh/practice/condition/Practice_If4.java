package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If4 {
	public static void main(String [] args) {
		
		/*A, B, C ����� ������ �Է� �ް� 
		 * �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		 * �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
		 * (A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		 * A����� ���� : 2500
           B����� ���� : 2900
           C����� ���� : 2600
           A��� ����/����+a : 2500/3500.0
           3000 �̻�
           B��� ����/����+a : 2900/2900.0
           3000 �̸�
           C��� ����/����+a : 2600/2989.9999999999995
           3000 �̸�
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b =sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		double aincen = a + a*0.4;
		double bincen = b; 
		double cincen = c + c*0.15;
		
		System.out.println("A����� ����/����+a : " + a + "/" + aincen );
		System.out.println(aincen >= 3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("B����� ����/����+a : " + b + "/" + bincen );
		System.out.println(bincen >= 3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("C����� ����/����+a : " + c +"/" + cincen );
		System.out.println(cincen >= 3000 ? "3000�̻�" : "3000�̸�");
		
		
		
		
	}

}
