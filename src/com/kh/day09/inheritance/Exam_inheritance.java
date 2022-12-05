package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point {  //Point import 해줘야함 , 다른 패키지
	void set() {  //부모의 멤버변수는 메소드 안에서 접근
		pub = 1;
		pro = 3;
//		def = 2;
//		pri = 4;
	}
}

class Child extends Parent{
	public Child() {}  //얘는 없어도 컴퓨터가 만들어줌
	void set() { //메소드안에서 접근, 같은 패키지
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4; private 라서 얘는 안됨, The field Parent.pri is not visible
	}
}

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}  //생성자, 얘는 없어도 컴퓨터가 자동으로 만들어줌
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;  //원래 파란색 money=2000, child.setMoney(3000); int money로 들어와서 둘이 더해줌
		                      //5000이 파란색money에 들어가서 child.getMoney() 이게 5000 이렇게출력
	}
}

public class Exam_inheritance {
	public static void main(String [] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney());
	}
}
