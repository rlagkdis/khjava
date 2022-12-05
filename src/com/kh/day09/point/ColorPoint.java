package com.kh.day09.point;

public class ColorPoint extends Point{
	private String color;   //점의 색
	//public ColorPoint() {}  // 이게 없으면 ColorPoint의 new ColorPoint(); 에서 오류가 난다.
	public ColorPoint(int x, int y, String color) {
		super(x, y);       //x, y 셋팅
		//Point의 생성자 Point(x,y) 호출
		//생성자 선택은 super!!
		this.color = color;  //getter,setter 대신 super 사용
	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	public void showColorPoint() {   //색, 좌표 출력
		System.out.println(color);
		showPoint();   //Point 클래스의 showPoint() 호출
	}

}
