package com.kh.day12.iostream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] cbuf = "자바가 제일 쉬웠어요.".toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("writer(char[]) 동작 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
