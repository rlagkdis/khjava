package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point {  //Point import ������� , �ٸ� ��Ű��
	void set() {  //�θ��� ��������� �޼ҵ� �ȿ��� ����
		pub = 1;
		pro = 3;
//		def = 2;
//		pri = 4;
	}
}

class Child extends Parent{
	public Child() {}  //��� ��� ��ǻ�Ͱ� �������
	void set() { //�޼ҵ�ȿ��� ����, ���� ��Ű��
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4; private �� ��� �ȵ�, The field Parent.pri is not visible
	}
}

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}  //������, ��� ��� ��ǻ�Ͱ� �ڵ����� �������
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;  //���� �Ķ��� money=2000, child.setMoney(3000); int money�� ���ͼ� ���� ������
		                      //5000�� �Ķ���money�� ���� child.getMoney() �̰� 5000 �̷������
	}
}

public class Exam_inheritance {
	public static void main(String [] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney());
	}
}
