package com.sist.io;
// 한글 깨짐 방지 => UTF-8 => AWS(리눅스)
import java.io.*;
import java.util.*;
// Properties => Spring / Spring-Boot => 파서기

public class 입출력_6{
	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\src\\com\\sist\\io\\db.properties"));
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String passWord = prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(passWord);
		
		Properties prop2 = System.getProperties();
		System.out.println(prop2.getProperty("java.version"));
		System.out.println(prop2.getProperty("user.language"));
		Properties prop3 = new Properties();
		prop2.setProperty("name","홍길동");
		prop2.setProperty("gender","남자");
		prop2.setProperty("age","25");
		prop2.store(new FileOutputStream("info.properties"), "회원정보");
		
		Properties prop4 = new Properties();
		prop4.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\info.properties"));
		String name = prop4.getProperty("name");
		String gender = prop4.getProperty("gender");
		String age = prop4.getProperty("age");
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		// Map형식을 따르고, 키가 중복되면 안됨
	}
}
