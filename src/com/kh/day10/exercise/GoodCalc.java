package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public int substract(int a, int b) {
		return a - b;
	}
	public double average(int [] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
	}
	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println("Че : " + calc.add(1, 2));
		System.out.println("Тї : " + calc.substract(1, 2));
		System.out.println("ЦђБе : " + calc.average(new int [] {2,3,5}));
	}
}


