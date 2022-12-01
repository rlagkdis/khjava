package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단 결과는 오름차순으로 정렬
		// 로또 번호는 6개
		// 로또 번호 범위 : 1 ~ 45
		int[] lottos = new int[6];
		Random rand = new Random();
		// 번호 6개 뽑기 범위는1~45
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			//중복 없이 추출
			for(int e = 0; e < i; e++ ) {
				//비교를 한다 , 비교할게 점점 많아진다
				//비교는 이미 뽑은거랑 첫번째부터
				if(lottos[i] == lottos[e]) {
					//같으면 i--;
					i--; 
					break; //for문빠져나가기
				}
				
			}
			
		}
		// 뽑은걸 정렬..버블정렬
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < (lottos.length) - 1; j++) {
				if (lottos[j] > lottos[j + 1]) {
					int temp = lottos[j + 1];
					lottos[j + 1] = lottos[j];
					lottos[j] = temp;

				}
			}
		}

		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}

}
