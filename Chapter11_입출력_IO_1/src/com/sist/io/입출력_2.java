package com.sist.io;
// 파일 읽기
// FileInputStream(1byte) / FileReader(2byte)
// 한글 포함 => 2byte씩 읽어야함 
import java.io.*;
import java.util.*;
public class 입출력_2 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		long start = 0, end = 0;
		try {
			start = System.currentTimeMillis();
			br = new BufferedReader(fr = new FileReader("C:\\javaDev\\movie.txt"));
			
			StringBuilder sb = new StringBuilder();
			char[] buf = new char[1024];
			while(br.read(buf, 0, 1024)!=-1) {
				sb.append(buf);
			}
			System.out.println(sb.toString());
			end = System.currentTimeMillis();
			System.out.println("읽은 시간:"+(end-start)/1000.0+"초");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
