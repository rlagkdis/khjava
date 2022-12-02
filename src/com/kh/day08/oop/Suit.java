package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit() {}
	
	public Suit(int size) {								// 1	�Ű����� 100�� �Ѿ��
		this(size, "Hazzys");							// ������ �Ű������� 2���� �Է� ��  2 ����
		System.out.println("Suit(int) ȣ��!!  " + size + " " + brand + " " + price);
	}
	
	public Suit(int size, String brand) {				// 2	�Ű����� size, "Hazzys"�� �Ѿ��
		this(size, brand, 100000);						// ������ �Ű����� 3���� �Է� �� 3 ����
		System.out.println("Suit(int, String) ȣ��!!  " + size + " " + brand + " " + price);
	}
	
	public Suit(int size, String brand, int price) {	// 3
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) ȣ��!!  " + size + " " + brand + " " + price);	// ���� ���� ����
	}

}


