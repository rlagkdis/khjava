package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit() {}
	
	public Suit(int size) {								// 1	매개변수 100이 넘어옴
		this(size, "Hazzys");							// 하지만 매개변수가 2개를 입력 →  2 실행
		System.out.println("Suit(int) 호출!!  " + size + " " + brand + " " + price);
	}
	
	public Suit(int size, String brand) {				// 2	매개변수 size, "Hazzys"가 넘어옴
		this(size, brand, 100000);						// 하지만 매개변수 3개를 입력 → 3 실행
		System.out.println("Suit(int, String) 호출!!  " + size + " " + brand + " " + price);
	}
	
	public Suit(int size, String brand, int price) {	// 3
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출!!  " + size + " " + brand + " " + price);	// 가장 먼저 실행
	}

}


