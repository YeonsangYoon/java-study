package com.sist.lib;
import java.io.*;
public class 라이브러리_String_2 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\javaDev\\movie.txt")){
//			long start = System.currentTimeMillis();
//			int i;
//			String data = "";
//			while((i=fr.read())!=-1) { // -1 : EOF(End Of File)
//				data+=(char)i;
//			}
//			long end = System.currentTimeMillis();
//			System.out.println(end-start);

			int i;
			long start = System.currentTimeMillis();
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			String data1 = sb.toString();
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
