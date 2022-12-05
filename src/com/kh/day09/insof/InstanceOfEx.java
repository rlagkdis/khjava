package com.kh.day09.insof;

public class InstanceOfEx {
	static void print(Person p) {
		//print(new Student()); 했을때
		//Person p = new Student() ->매개변수p를통해서 Student객체를 받고있다.
//		if(p instanceof Person)
//		System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!");
	}
	public static void main(String [] args) {
		//print(new Person());
		//Student클래스에서 extends Person 안하면 오류남
		//Person p = new Student() 이게 안되니까 오류
		print(new Student());  //Person을 상속받은 클래스라서 업캐스팅됨
		print(new Researcher());
		print(new Professor()); 
	}

}
