package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		// ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����
		// �⺻������ �ٸ� ���Ŀ� ���� ���� �ӵ��� ������, �������� ������ ��
		// ���� ����
		// {2, 5, 4, 1, 3}
		// i=0�� ��
		// 2, 5, 4, 1, 3
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
//			for(int j = (arrs.length-1)-i; j>=1; j--) {
//				if(arrs [j] > arrs[j+1]) {
//					int temp = arrs[j+1];
//					arrs[j+1] = arrs[j-1];
//					arrs[j] = temp;
//				}
//			}
//			��������x
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	
		
	}

}
