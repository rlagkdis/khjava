package com.kh.day09.insof;

public class InstanceOfEx {
	static void print(Person p) {
		//print(new Student()); ������
		//Person p = new Student() ->�Ű�����p�����ؼ� Student��ü�� �ް��ִ�.
//		if(p instanceof Person)
//		System.out.println("Person�Դϴ�!");
		if(p instanceof Student)
			System.out.println("Student�Դϴ�!");
		if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�!");
		if(p instanceof Professor)
			System.out.println("Professor�Դϴ�!");
	}
	public static void main(String [] args) {
		//print(new Person());
		//StudentŬ�������� extends Person ���ϸ� ������
		//Person p = new Student() �̰� �ȵǴϱ� ����
		print(new Student());  //Person�� ��ӹ��� Ŭ������ ��ĳ���õ�
		print(new Researcher());
		print(new Professor()); 
	}

}
