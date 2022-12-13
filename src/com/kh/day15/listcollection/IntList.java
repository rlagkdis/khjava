package com.kh.day15.listcollection;

public class IntList {
	private int [] nums;
	private int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int input) {
		nums[size] = input;
		size++;
	}
	// ����(return)���� ������ ���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ���� ������.  (void ���� int��)
	public int get(int index) {
		return nums[index];  
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
	}

}
