package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	    ScoreFunction sFunc = new ScoreFunction();
		Byebye :
		while(true) {
			int choice = sFunc.printMenu();			
			switch(choice) {
			case 1 :
				sFunc.inputScore();
				break;
			case 2 :
				sFunc.printScore();
				break;
			case 3 :
				sFunc.goodByeMsg();
				break Byebye;
			default :
				sFunc.exceoptionMsg();
				break;
			}
		}
	}

}
