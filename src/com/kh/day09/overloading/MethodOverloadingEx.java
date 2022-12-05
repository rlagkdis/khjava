package com.kh.day09.overloading;

class Weapon {
	// 생성자도 오버로딩
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + ":" + name);
	}
	
	protected int fire() {
		return 1;
	}
	//오버로딩
	//자기 자신에게 복붙, 매개변수 타입or갯수가 달라짐
	protected int fire(int steampack) {  //오버로딩은 복붙(protected int fire())을 자기 자신한테
		return steampack*100;    
	}
	protected int fire(int steampack, int medicine) {  //복붙의 매개변수의 수를 다르게
		return steampack+medicine;
	}
	protected int fire(String steampack) {   //타입을 다르게
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() {    //오버라이딩은 복붙을 자식한테
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String [] args) {
		//println();도 오버로딩,오버로딩이 안됐으면 println();을 계속못씀
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}

}
