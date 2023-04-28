package com.sist.lib;

import java.util.*;

public class 라이브러리_Set_5 {
	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0;i<10;i++) {
			int r = (int)(Math.random()*100+1);
			set.add(r);
		}
		System.out.println(set);
		// 50보다 큰수
		for(Object o : set)
			if((int)o>50)
				System.out.print(o + " ");
		// 50보다 작은수
		System.out.println();
		for(Object o : set)
			if((int)o<50)
				System.out.print(o + " ");
		
		System.out.println("\n=============================");
		// 1. 정렬
		// 2. 검색이 빠르다
		TreeSet tSet = new TreeSet();
		
		for(int i=0;i<10;i++) {
			int r = (int)(Math.random()*100+1);
			tSet.add(r);
		}
		System.out.println(tSet);
		System.out.println("50보다 작은 수: "+tSet.headSet(50));
		System.out.println("50보다 큰 수: "+tSet.tailSet(50));
	}
}
