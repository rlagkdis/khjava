package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";
	//name = "Hello World";  //상수값이라서 바뀌지 않음.
	public static final int TIME_OUT = 10000;
	public void sendCall(); //메소드 이름을 sendCall()로 강제
	public abstract void receiveCall();
	abstract void printLogo();
	void displayNumber();
	public default void showLogo() {  //디폴트 메소드
		// 하위 호환성을 위해서 작성한다.
		// 즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}

}
