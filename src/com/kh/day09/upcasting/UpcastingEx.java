package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("일용자");
		//p = new Person(""); //객체 생성
		p = s;  //업캐스팅
		
		System.out.println(p.name);
		
		//밑에 두개는 자식이 가지고 있는거라서 오류가 난다.
//		System.out.println(p.grade);
//		System.out.println(p.department);
		
		// 다운 캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
		
		
		
		
		
		
		
	}

}
