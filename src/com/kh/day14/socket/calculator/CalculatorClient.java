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
			System.out.println("서버와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
				// 계산식(빈칸으로 띄어 입력, ex) 24 + 42) >> 12 + 1
				// 계산결과 : 13
				// 1. 입력받기
				System.out.println("계산식(빈칸으로 띄어 입력, ex) 24 + 42) >");
				String inputVal = sc.nextLine();
				// 2. 보내기
				dos.writeUTF(inputVal);
				if (inputVal.equalsIgnoreCase("bye")) {
					System.out.println("종료하였습니다.");
					break;
				}
				// 받기
				String resultMsg = dis.readUTF();
				if (resultMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				System.out.println("계산결과 : " + resultMsg);
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
