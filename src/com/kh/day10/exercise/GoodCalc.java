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
		System.out.println("�� : " + calc.add(1, 2));
		System.out.println("�� : " + calc.substract(1, 2));
		System.out.println("��� : " + calc.average(new int [] {2,3,5}));
	}
}


