package com.sist.game;

import java.util.Scanner;

/*
 * 
 */
public class BaseBallGame {
	private int tryCount;
	private int[] com;
	
	BaseBallGame(){
		tryCount = 0;
		com = new int[3];
	}
	
	void init() {
		tryCount = 0;
		boolean[] hash = new boolean[10];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9+1);
			if(hash[com[i]])
				i--;
			else
				hash[com[i]]=true;
		}
	}
	
	int[] getUserInput() {
		Scanner Sc = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 수 입력(100~999):");
			int num = Sc.nextInt();
			
			if(num < 100 || num > 999) {
				System.out.println("세자리수를 입력해주세요!");
				continue;
			}
			
			int n1 = num / 100;
			int n2 = (num % 100)/10;
			int n3 = num % 10;
			
			if(n1 == 0 || n2 == 0 || n3 == 0) {
				System.out.println("0을 포함하지 않는 수를 입력해주세요!");
				continue;
			}
			else if(n1 == n2 || n2 == n3 || n3 == n1) {
				System.out.println("중복되지 않는 수를 입력해주세요!");
				continue;
			}
			
			tryCount++;
			int user[] = {n1, n2, n3};
			return user;
		}
	}
	
	String getStrikeCntBallCnt(int[] user) {
		int sCnt = 0, bCnt = 0;
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<com.length;j++) {
				if(user[i]==com[j]) {
					if(i==j)
						sCnt++;
					else
						bCnt++;
				}
			}
		}
		String ret = sCnt + "S-" + bCnt+ "B";
		return ret;
	}
	int getTryCount() {
		return tryCount;
	}
}
