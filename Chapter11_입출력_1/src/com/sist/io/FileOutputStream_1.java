package com.sist.io;
import java.io.*;
import java.util.*;
public class FileOutputStream_1 {
	public static void main(String[] args) {
		try {
			// 파일 지정
			File file = new File("c:\\java_datas\\school.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream f = new FileOutputStream(file,true); // append 모드면 write해도 기존 내용 유지
			String msg = "지금은 파일 입출력 공부중\r\n";
			f.write(msg.getBytes()); // 파일 내용 지우고 새로 작성
			f.close();
		}catch(Exception e) {}
	}
}
