package com.kh.day11.javaapi;

public class Exam_String {
	public static void main(String [] args) {
		String msg = "Hello Java";
		msg = new String("Hello J");
		
		String data1 = new String(" C#");  // �տ� ���� ��ĭ
		String data2 = new String(",C++ ");  //�ڿ� ���� ��ĭ
		
		System.out.println(data1 + "�� ���̴� " + data1.length());  //��������
		System.out.println(data2 + "�� ���̴� " + data2.length());
		System.out.println("#�� �ִ°�? : " + data1.contains("#")); //# ������ true
		
		// ���ڿ� ����
		data1 = data1.concat(data2); //  C#,C++ (data1�տ� ������ĭ,"���ڿ�: " �ϰ� ������ĭ
		System.out.println("����� ���ڿ� : " + data1);
		
		// ��������
		data1 = data1.trim();
		System.out.println("���� ���� Ȯ�� : " + data1); //data1�� ���� �����
		
		// C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("���ڿ� ��ü : " + data1);
		
		// ���ڿ� �и�
		String [] words = data1.split(",");
		for(int i = 0; i <words.length; i++) {
			System.out.println("�и��� ���ڿ� : " + i + " : " + words[i]);
		}
		
		// ���ڿ� �ڸ���
//		data1 = data1.substring(5);
//		System.out.println("���ڿ� �ڸ��� : " + data1);
		data1 = data1.substring(1, 4);
		System.out.println("������ �ڸ��� : " + data1);
		
		char word = data1.charAt(1);
		System.out.println("���� �ڸ��� : " + word);
	}

}
