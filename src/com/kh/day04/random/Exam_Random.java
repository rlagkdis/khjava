package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			//nextInt(n) -> 0���� n-1������ ������ �� ����
			//1���� 10������ �� �߿��� ������ ���� �̰� ������
			//-> nextInt(10)+1, �� +1�� ������ �����Ѵ�
			//System.out.println(rand.nextInt(10)+1);
		//System.out.println(rand.nextInt(10));  //0���� 9����
			
		//ex1. 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�??
		//nextInt(??) +?? �ؾ��ұ��?
		//20���� 35 ���� -> ������ 0 ���ͷ� �����ߵ�
		// 0���� 15���� -> nextInt()??, ?? = (n-1 = 15)
			//nextInt(16) + 20
			System.out.println(rand.nextInt(16)+20);
			
			//ex2. 10���� 23������ �� �߿��� ������ ���� �̰� �ʹٸ�??
			//0���� 13���� -> nextInt(14) + 10
		}
	}

}
