package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";
	//name = "Hello World";  //������̶� �ٲ��� ����.
	public static final int TIME_OUT = 10000;
	public void sendCall(); //�޼ҵ� �̸��� sendCall()�� ����
	public abstract void receiveCall();
	abstract void printLogo();
	void displayNumber();
	public default void showLogo() {  //����Ʈ �޼ҵ�
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}

}
