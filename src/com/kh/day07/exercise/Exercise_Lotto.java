package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�
		// �� ����� ������������ ����
		// �ζ� ��ȣ�� 6��
		// �ζ� ��ȣ ���� : 1 ~ 45
		int[] lottos = new int[6];
		Random rand = new Random();
		// ��ȣ 6�� �̱� ������1~45
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			//�ߺ� ���� ����
			for(int e = 0; e < i; e++ ) {
				//�񱳸� �Ѵ� , ���Ұ� ���� ��������
				//�񱳴� �̹� �����Ŷ� ù��°����
				if(lottos[i] == lottos[e]) {
					//������ i--;
					i--; 
					break; //for������������
				}
				
			}
			
		}
		// ������ ����..��������
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
