package com.sist.lib;

import java.util.Scanner;

// charAt(0)
// 문자열을 입력받아 좌우 대칭인지 확인
// 짝수 : abccba 
//       012345 (6)
// 홀수 : abcdcba
//       0123456 (7)


public class 라이브러리_String_4 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s = Sc.next();
		
		boolean isPalindrome = true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) // Palindrome : 회문 (거꾸로 읽어도 똑같은 단어)
			System.out.println(s + "는 좌우 대칭입니다!");
		else
			System.out.println(s + "는 좌우 대칭이 아닙니다!");
	}
}
