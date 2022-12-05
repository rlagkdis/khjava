package Project;

import java.util.Scanner;

public class PlayerFunction {
	Player [] players;
	
	public PlayerFunction () {
		players = new Player[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======���� Ȯ�� ���α׷�======");
		System.out.println("1. ���� ���� �Է�");
		System.out.println("2. ����Ŭ�� ���� ���� Ȯ��");
		System.out.println("3. ������ Ȯ��");
		System.out.println("4. ����");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < players.length; i++) {
			System.out.println(""+(i+1)+"��° ���� ���� �Է�");
			System.out.print("���� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("���� �� �� �Է� : ");
			int goal = sc.nextInt();
			System.out.print("���� �� �Է� : ");
			int assist = sc.nextInt();
			players[i] = new Player();
			players[i].setName(name);
			players[i].setGoal(goal);
			players[i].setAssist(assist);
		}
	}
	
	public void joinTen() {
		for(int i = 0; i < players.length; i++) {
			int g = players[i].getGoal();
			int a = players[i].getAssist();
			System.out.println(""+(i+1)+" ��°" + " "+players[i].getName()+ "������ ?");
			// ���� 10�̻��̰� ��ý�Ʈ�� 10 �̻��� ��츸 ����Ŭ���� �����Ѵ�.
			if (g >= 10 && a >= 10) {
				System.out.println("���� Ŭ�� ����!");
			}else {
				// ��ý�Ʈ�� 10�̻��ε�, ���� 10���� �����ϸ� ���� �����ϴٰ� ���
				if (g < 10) {
					System.out.println("�� ����!");
				}
				// ���� 10 �̻��ε�,  ��ý�Ʈ�� 10���� �����ϸ� ���� ���� �̶�� ���
				if (a < 10) {
					System.out.println("���� ����!");
				}
				}
			}
		}
	//���� �������� �������϶� �̸� �ٰ��� �������ϴ°� ����..
	public void goldenB() {
		int max = 0;
		String maxn = "";
		for(int i = 0; i < players.length; i++) {
			if (players[i].getGoal() > max) {
				//i��° ������ �� ���� max ���� ũ�� 
				//max �� i��° ������ ���� �ְ�
				//maxn���� i��° ������ �̸��� �ִ´�.
				max = players[i].getGoal();
				maxn = players[i].getName();
			} 
		}
		    // �� ���� ���� ���� ���� �̸� ���
			System.out.println("�������� " + maxn + " ~~!!");
		}
	
}
