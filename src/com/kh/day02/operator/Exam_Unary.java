package com.kh.day02.operator;

public class Exam_Unary {
   public static void main(String [] args) {
	   // ���׿�����, ���׿�����
	   // a = a + 1 , b = b - 1
	   //int a = 1;
	   //System.out.println(a++); //��������(���߿���) ������º���
	 
	   //System.out.println(a);
	   //System.out.println(++a); //��������(��������)
	   
	   /*1�� ����
	   a�� 10�̰�, b�� 20, c�� 30�̶�� ���� ��
	   a++;                    > a=11, b=20, c=30
	   b = (--a) + b;          > a=10, b=30, c=30
	   c = (a++) + (--b);      > a=11, b=29, c=39
	   ���� a,b,c�� ����?
	   11 29 39
	   */
	   
	   
	   /*2�� ����
	   x�� 100�̰�, y�� 33, z�� 0�� �� 
	   x--;                     >x=99, y=33, z=0
	   z = x-- + --y;           >x=98, y=32, z=99+32
	   x = 99 + x++ + x;        >x=99+98+99, y=32, z=131
	                             x�� ���� �� ����ϰ� ()+1
	                             x++ �ڿ� �Ȱ��� x �־ �ٷΰ��
	   y = y-- + y + ++y;       >>x=296, y=32+31+32, z=0
	                              ������ �� ����ϰ� ���߿� () -1
	                              y-- �ڿ� �Ȱ��� y�� �־ �ٷΰ��
	   x, y, z ����
	   296, 95, 131
	   */
	   
	   int a = 10;
	   int b = 20;
	   int c = 30;
	   System.out.println("1�� ����");
	   System.out.println("a++;");
	   System.out.println("b = (--a) + b;");
	   System.out.println("c = (a++) + (--b)");
	   a++;
	   b = (--a) + b;
	   c = (a++) + (--b);
	   System.out.println("a�� �� : " + a);
	   System.out.println("b�� �� : " + b);
	   System.out.println("c�� �� : " + c);
	   
	   System.out.println("2�� ����");
	   System.out.println("x--;");
	   System.out.println("z = x-- + --y;");
	   System.out.println("x = 99 + x++ + x;");
	   System.out.println("y = y-- + y + ++y;");
	   int x = 100;
	   int y = 33;
	   int z = 0;
	   x--;
	   z = x-- + --y;
	   x = 99 + x++ + x;
	   y = y-- + y + ++y;
	   System.out.println("x�� �� : "+ x);
	   System.out.println("y�� �� : "+ y);
	   System.out.println("z�� �� : "+ z);
	   
	   System.out.println("����������");
	   boolean result = true;
	   System.out.println("result�� ��: " + result);
	   System.out.println("!result�� �� : "+ !result);
	   
	   
	   
	   
	   
	}
}
