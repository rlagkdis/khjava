package com.kh.day03.typetrans;

public class TestTypeTrans1 {
	public static void main(String [] args) {
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;	
		System.out.println("result : " + result);
		//자동형변환 : 작은타입이 큰타입을 만나면 큰타입으로 변함
		//강제형변환 : 큰타입을 작은타입으로 바꿀때 
		System.out.println("강제 형 변환 : " + (int)result);
		System.out.println("강제 형 변환2 : " + (char)65);
		
	}

}
