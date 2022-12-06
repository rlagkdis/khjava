package com.kh.day10.interfaceex;
//extends 는 안됨 PhoneInterface가 인터페이스라서.인터페이스는 상속x
public class SamsungPhone implements PhoneInterface{
	
    //추상 메소드들을 오버라이딩한 것
	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Samsung =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
	}  
	//메소드 추가 가능
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}

}
