package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("이름을 입력해주세요.");
	    String name = sc.next();
	    System.out.println("태어난 월을 입력해주세요.");
	    int month = sc.nextInt();
	    System.out.println("키를 입력해주세요.");
	    double height = sc.nextDouble();
	    System.out.println("성별을 입력해주세요.");
	    char gender = sc.next().charAt(0);
	    System.out.println("주소를 입력해주세요.");
	    sc.nextLine();           //엔터 제거 , nextLine()은 엔터를 입력받음! 
	                             //공백,띄어쓰기 입력받음(메시지,주소 받을때 nextLine씀)
	    String address = sc.nextLine();       
	    
	    System.out.println("이름은 " + name + "입니다.");
	    System.out.println("태어난 월은 " + month + "입니다.");
	    System.out.println("키는 " + height + "입니다.");
	    System.out.println("성별은 " + gender + "입니다.");
	    System.out.println("주소는 " + address + "입니다.");
	    
	    //nextLine 은 위에 nextLine 한번 써줘야함
	 
	 
//		이름을 입력해주세요. // next()
//		민봉식
//		태어난 월을 입력해주세요.
//		9
//		키를 입력해주세요.
//		180
//		성별을 입력해주세요.
//		남
//		주소를 입력해주세요. // nextLine()
//		서울시 종로구
		
//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다.
     
	}
}
