package com.kh.day02.variable;

public class TestDataType {
    public static void main(String [] args) {
    	// 자료형 변수명 대입연산자 데이터 ;
    	// 1. 자료형의 종류
    	// 정수, 문자열
    	// int , String 
    	// 정수part
    	byte bNum = 127; // -128~127
    	short sNum = 32767; // -32768~32767
    	int iNum = 2147483647; // -2147483648~2147483648
    	long lNum = 2147483648l; //접미사 l을 붙여야함 (숫자 끝에 l
    	short num = 128;
    	
    	//실수 part
    	float fNum = 22.1123f; //접미사 f를 붙여야함
    	double dNum = 23.502;
    	//평균 구할때 많이씀
    	
    	//문자part
    	char fChar = 'A'; // ''(홀따옴표)안에 한개의 문자만 
    	String sChar = "Hello Java"; // ""(쌍따옴표) 안에는 여러개의 문자
   
    	//Boolean형 
    	boolean result = false; 
    	// 1>0 , 2<1 -> true , false
    	
    	System.out.println("정수의 값 : "+iNum);
    	System.out.println("정수의 값(9999억) : "+lNum);
    	System.out.println("실수의 값 : " + fNum);
    	System.out.println("실수의 값 : " + dNum);
    	System.out.println("문자의 값 : " + fChar);
    	System.out.println("문자열의 값 : " + sChar);
    	System.out.println("논리의 값 : " + result);
    	
    	fChar = 66;
    	System.out.println("문자에 숫자 : " + fChar);
    	
    	fChar = 75;
    	System.out.println("문자에 숫자2: " + fChar);
    	//Char 는 숫자를 넣을 수 있음
    	//ASCII (아스키) 코드
    	// 문자(char)는 숫자를 저장할 수 있고 ASCII코드에
    	// 매핑되어있는 문자로 출력이 가능하다.
    	// (66=B ,67=C 68=D 이렇게 )
    	
    	
    }
}
