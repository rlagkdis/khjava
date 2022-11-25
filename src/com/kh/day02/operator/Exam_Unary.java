package com.kh.day02.operator;

public class Exam_Unary {
   public static void main(String [] args) {
	   // 단항연산자, 이항연산자
	   // a = a + 1 , b = b - 1
	   //int a = 1;
	   //System.out.println(a++); //후위연산(나중연산) 먼저출력부터
	 
	   //System.out.println(a);
	   //System.out.println(++a); //전위연산(먼저연산)
	   
	   /*1번 문제
	   a는 10이고, b는 20, c는 30이라고 했을 때
	   a++;                    > a=11, b=20, c=30
	   b = (--a) + b;          > a=10, b=30, c=30
	   c = (a++) + (--b);      > a=11, b=29, c=39
	   각각 a,b,c의 값은?
	   11 29 39
	   */
	   
	   
	   /*2번 문제
	   x는 100이고, y는 33, z는 0일 때 
	   x--;                     >x=99, y=33, z=0
	   z = x-- + --y;           >x=98, y=32, z=99+32
	   x = 99 + x++ + x;        >x=99+98+99, y=32, z=131
	                             x는 원래 다 계산하고 ()+1
	                             x++ 뒤에 똑같은 x 있어서 바로계산
	   y = y-- + y + ++y;       >>x=296, y=32+31+32, z=0
	                              원래는 다 계산하고 나중에 () -1
	                              y-- 뒤에 똑같은 y가 있어서 바로계산
	   x, y, z 값은
	   296, 95, 131
	   */
	   
	   int a = 10;
	   int b = 20;
	   int c = 30;
	   System.out.println("1번 문제");
	   System.out.println("a++;");
	   System.out.println("b = (--a) + b;");
	   System.out.println("c = (a++) + (--b)");
	   a++;
	   b = (--a) + b;
	   c = (a++) + (--b);
	   System.out.println("a의 값 : " + a);
	   System.out.println("b의 값 : " + b);
	   System.out.println("c의 값 : " + c);
	   
	   System.out.println("2번 문제");
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
	   System.out.println("x의 값 : "+ x);
	   System.out.println("y의 값 : "+ y);
	   System.out.println("z의 값 : "+ z);
	   
	   System.out.println("부정연산자");
	   boolean result = true;
	   System.out.println("result의 값: " + result);
	   System.out.println("!result의 값 : "+ !result);
	   
	   
	   
	   
	   
	}
}
