package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String [] args) {
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("����", today);
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("������", someDate);
		System.out.println();
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 04, 02);
		endDate.set(Calendar.HOUR_OF_DAY, 18);
		endDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("������", endDate);
		
	}
	
	public void printCalendar(String msg, Calendar cal) {
		//Calendar today = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //month�� 0 ���ͽ���
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1�� �Ͽ���
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); //24�ð� ǥ��
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); //�и�������
		System.out.print(msg+ " " + year + "/" + month + "/" + day + "/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY :    System.out.print("�Ͽ���");break;
		case Calendar.MONDAY :    System.out.print("������");break;
		case Calendar.TUESDAY :   System.out.print("ȭ����");break;
		case Calendar.WEDNESDAY : System.out.print("������");break;
		case Calendar.THURSDAY :  System.out.print("�����");break;
		case Calendar.FRIDAY :    System.out.print("�ݿ���");break;
		case Calendar.SATURDAY :  System.out.print("�����");break;
		}
		System.out.print("(" + hourOfDay + "��)");
		if(ampm == Calendar.AM) System.out.print(" ���� ");
		else System.out.print(" ���� ");
		System.out.println(hour + "��" + minute + "��" + second + "�� " + millisecond + "�и���");
	}

}
