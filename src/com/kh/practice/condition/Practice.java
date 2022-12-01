package com.kh.practice.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다, 다시 입력:");
				sc.next();
				i--;
				continue;
			}
			sum += num;
		}
		System.out.print(sum);
	}

}
