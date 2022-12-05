package com.kh.day09.upcasting;

public class Student extends Person{
	//처음에 extend Person 쓰면 Student 에 오류가 뜨는데 그건 밑에 생성자를 아직 안써서 그런거
	String grade;
	String department;
	
	public Student(String name) {  //매개변수가 있는 생성자
		super(name);
	}

}
