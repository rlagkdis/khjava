package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String [] args) {
		Exercise_Lotto eL = new Exercise_Lotto();
		//eL.lottoProgram();
		
		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.name = "�Ͽ���";   -> private
//		person.jobName = "�ǻ�";
		Scanner sc = new Scanner(System.in);
		// Rectangle rect :
		// ���۷��� ���� ����
		// ���� ���� ����
		// �ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle();   //��ü����, �ݵ�� new Ű���� �̿�
		 //�ڷ���(Ÿ��)  ����  Ű����  ������       //new�� ��ü�� ������ ȣ��
		//Rectangle Ŭ���� �ȿ��ִ� ������
		//Ű����� �����ؼ� �װ� ������ �����ؼ� ���ڴ�
		System.out.print("�ʺ� �Է����ּ��� : ");
		// ��ü�� ��� ����(����� �����δ� ��� ������ ��� �޼ҵ�)
		//�ν��Ͻ�(Rectangle Ŭ������ ��ü)
		rect.width = sc.nextInt();   //��ü�� ��� ������ .���� �Ѵ�. ������� ����
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt(); //������� ����
		int result = rect.getArea(); //����޼ҵ� ����
		System.out.println("�簢���� ������ : " + result);
		
	}

}
