package com.sist.io;
// 파일쓰기
import java.util.*;
import java.io.*;
public class 입출력_3 {
	public static void main(String[] args) {
		FileWriter out = null;
		FileReader in = null;
		try {
			// 1. 파일 생성
			File file = new File("c:\\java_datas\\movie.txt");
			if(!file.exists())
				file.createNewFile();
			// 2. reader, writer 생성
			in = new FileReader("c:\\javaDev\\movie.txt");
			out = new FileWriter(file);
			// 3. 파일 읽기 + 쓰기
			char[] buf = new char[8192];
			while(in.read(buf, 0, 8192)!=-1) {
				out.write(buf, 0, 8192);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
				in.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
