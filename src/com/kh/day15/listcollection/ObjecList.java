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
	// 리턴(return)값이 있으면 리턴값의 자료형을
	// 메소드 반환형에 적어줌.  (void 말고 int로)
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
