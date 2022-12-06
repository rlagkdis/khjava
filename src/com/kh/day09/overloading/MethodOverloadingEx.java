package com.kh.day09.overloading;

class Weapon {
	// �����ڵ� �����ε�
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
	//�����ε�
	//�ڱ� �ڽſ��� ����, �Ű����� Ÿ��or������ �޶���
	protected int fire(int steampack) {  //�����ε��� ����(protected int fire())�� �ڱ� �ڽ�����
		return steampack*100;    
	}
	protected int fire(int steampack, int medicine) {  //������ �Ű������� ���� �ٸ���
		return steampack+medicine;
	}
	protected int fire(String steampack) {   //Ÿ���� �ٸ���
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() {    //�������̵��� ������ �ڽ�����
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String [] args) {
		//println();�� �����ε�,�����ε��� �ȵ����� println();�� ��Ӹ���
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}

}