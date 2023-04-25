package com.sist.lib;

import java.util.Scanner;

/*
 *    String은 문자 배열
 *    ------ 문자마다 인덱스번호를 가지고 있다(0부터 시작)
 *    String s = "Hello Java"
 *                0123456789
 *    
 *    주요기능(310page)
 *    1) 문자열에서 문자 한개 추출 => char charAt(int index)
 *    
 *                
 */
public class 라이브러리_String_3 {
	public static void main(String[] args) {
		String msg = "Hello Java";
//		for(int i=0;i<msg.length();i++) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
		
		// msg를 거꾸로 출력
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.print(msg.charAt(i));
//		}
		
		// 알파벳 문자열을 입력받아서 대문자, 소문자 개수를 출력하는 프로그램
		Scanner Sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s = Sc.nextLine();
		
		int up=0, down=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z')
				up++;
			else if(c>='a'&&c<='z')
				down++;
		}
		System.out.println("소문자:"+down+", 대문자:"+up);
	}
}
