package com.kh.day09.overriding;

class SuperClass{
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {  //�������̵��Ǿ�����
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");  //�������̵� �� �޼ҵ� ��������
	}
}

public class SampleProgram {
	public static void main(String[] args) {
		SuperClass ex = new SubClass(); // ��ĳ����
		ex.paint();                     // �θ�Ÿ�� ���� ex
	}
}
