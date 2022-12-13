package com.kh.day15.listcollection;

public class RList<T> {
	private Object [] objects;
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	// 리턴(return)값이 있으면 리턴값의 자료형을
	// 메소드 반환형에 적어줌.  (void 말고 int로)
	public T get(int index) {
		return (T)objects[index];  
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}
