package com.sist.exception;
import java.io.*;
public class 예외처리_예외복구_8 {
	public static void main(String[] args) {
//		int i=0;
//		FileReader fr=null;
//		try {
//			fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_8.java");
//			int c;
//			while((c=fr.read())!=-1) {
//				System.out.print((char)c);
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fr.close();
//			}
//			catch(IOException e) {}
//		}
		
		// 아래와 같은 코드는 자동으로 fr를 close해준다
		String filePath = "C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_8.java";
		try(FileReader fr = new FileReader(filePath)){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
}
