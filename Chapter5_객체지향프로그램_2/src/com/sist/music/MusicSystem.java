package com.sist.music;

import java.util.Scanner;

public class MusicSystem {
	Music[]	music = new Music[50];
	
	
	int menu() {
		System.out.println("================= Menu =================");
		System.out.println("1. 목록보기");
		System.out.println("2. 검색");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료");
		System.out.println("========================================");
		Scanner Sc = new Scanner(System.in);
		System.out.print("메뉴 선택");
		return Sc.nextInt();
	}
	
	
}
