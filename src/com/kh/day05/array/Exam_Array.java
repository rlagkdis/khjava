package com.kh.day05.array;

public class Exam_Array {
	public static void main(String [] args) {
		int num;
		// 1. 선언, 2. 할당, 3. 초기화
		int [] nums = new int[10];    // 1.  , 2.
		nums[0] = 10;
		nums[1] = 20;                 //3.
		nums[2] = 30;
		System.out.println("첫번째 값 : " + nums[0]);
		System.out.println("두번째 값 : " + nums[1]);
		System.out.println("세번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 100;
			System.out.print(nums[i]);
		}
//		System.out.println();
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i]);
//		}
	}
	
	

}
