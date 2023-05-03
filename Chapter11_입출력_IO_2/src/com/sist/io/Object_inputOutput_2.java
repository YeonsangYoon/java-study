package com.sist.io;
import java.util.*;
import java.io.*;
public class Object_inputOutput_2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\java_datas\\sawon.txt"));
		
		List<Sawon> list = (List<Sawon>)ois.readObject();
		
		for(Sawon s : list)
			System.out.println(s.toString());
	}
}
