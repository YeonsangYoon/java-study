package com.sist.io;
import java.io.*;
public class FileMain {
	public static void main(String[] args) {
//		try {
//			File dir = new File("C:\\java_datas");
//			if(!dir.exists()) {
//				dir.mkdir();
//				System.out.println("폴더만들기");
//			}
//		}catch (Exception e) {e.printStackTrace();}
		
		try {
			File dir = new File("c:\\javaDev");
			File[] fList = dir.listFiles();
			
			for(File f : fList) {
				if(f.isFile())
					System.out.println(f.getName()+" "+(f.length()));
				else if(f.isDirectory())
					System.out.println(f.getName()+" DIR");
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
