package com.kh.day10.interfaceex;
//extends �� �ȵ� PhoneInterface�� �������̽���.�������̽��� ���x
public class SamsungPhone implements PhoneInterface{
	
    //�߻� �޼ҵ���� �������̵��� ��
	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Samsung =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx-xxxx-xxxx");
	}  
	//�޼ҵ� �߰� ����
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}

}
