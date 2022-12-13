package com.kh.day15.listcollection;

public class ObjecList {
	private Object [] objects;
	private int size;
	
	public ObjecList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	// ����(return)���� ������ ���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ���� ������.  (void ���� int��)
	public Object get(int index) {
		return objects[index];  
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}
