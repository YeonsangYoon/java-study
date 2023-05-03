package com.sist.project;
import java.io.*;
import java.util.*;
public class test {
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\java_datas\\InfearnData.txt"));
		
		List<LectureVO> list = (ArrayList<LectureVO>)ois.readObject();
		
		for(LectureVO vo:list) {
			System.out.print(vo.getId() + " ");
			System.out.print(vo.getCno() + " ");
			System.out.print(vo.getTitle() + " ");
			System.out.print(vo.getContent() + " ");
			System.out.print(vo.getPoster() + " ");
			System.out.print(vo.getPrice() + " ");
			System.out.println();
		}
	}
}
