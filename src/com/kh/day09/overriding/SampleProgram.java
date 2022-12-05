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
	void paint() {  //오버라이딩되어있음
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");  //오버라이딩 된 메소드 먼저실행
	}
}

public class SampleProgram {
	public static void main(String[] args) {
		SuperClass ex = new SubClass(); // 업캐스팅
		ex.paint();                     // 부모타입 변수 ex
	}
}
