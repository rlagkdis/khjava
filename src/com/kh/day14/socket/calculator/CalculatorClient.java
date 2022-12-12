package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String [] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8989;
		InputStream is =null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address,port);
			System.out.println("������ ����Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
				// ����(��ĭ���� ��� �Է�, ex) 24 + 42) >> 12 + 1
				// ����� : 13
				// 1. �Է¹ޱ�
				System.out.println("����(��ĭ���� ��� �Է�, ex) 24 + 42) >");
				String inputVal = sc.nextLine();
				// 2. ������
				dos.writeUTF(inputVal);
				if (inputVal.equalsIgnoreCase("bye")) {
					System.out.println("�����Ͽ����ϴ�.");
					break;
				}
				// �ޱ�
				String resultMsg = dis.readUTF();
				if (resultMsg.equalsIgnoreCase("end")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. ���Ŀ� �°� �Է����ּ���.");
					continue;
				}
				System.out.println("����� : " + resultMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				is.close();
				os.close();
				dos.close();
				dis.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
