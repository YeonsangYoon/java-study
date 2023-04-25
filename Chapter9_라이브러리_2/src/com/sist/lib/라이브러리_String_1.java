package com.sist.lib;
/*
 *    305page
 *      = String : 문자열을 조작하고 처리하는 기능
 *                 ----------
 *                 = String은 클래스, 일반 데이터형으로 취급
 *                   => 모든 클래스는 Call By Reference 
 *                   ?? Java는 Call by Value
 *                 = 메모리 할당 (저장)
 *                   = String s = "Hello";
 *                   = String s = new String("Hello");  
 */
public class 라이브러리_String_1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		// 같은 메모리 주소에 저장
		String s3 = new String("hello");
		String s4 = new String("hello");
		// 새로운 메모리에 저장
		// String => 저장은 주소를 저장하고 있다
		// char[] => 쉽게 사용이 가능하게 만들어 준다
		
		if(s1 == s2) { //같은 곳에 저장이 되어 있는지 확인 (메모리 주소)
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		if(s1 == s3) {
			System.out.println("s1과 s3는 같다");
		}
		else {
			System.out.println("s1과 s3는 같지 않다");
		}
		
		// 실제 => 저장된 데이터값이 같은지 확인한다 : equals
		// s1에 저장된 값과 s3에 있는 값이 같은지 확인 
		if(s1.equals(s3)) {
			System.out.println("s1과 s3는 같은 값을 가지고 있다");
		}
		else {
			System.out.println("s1과 s3는 다른 값을 가지고 있다");
		}
		
		// 308page => 문자열 결합 (+)
		String ss = "Hello ";
		String ss1 = "Java!!";
		String ss2 = ss+ss1;
		System.out.println(ss2);
		
		// StringBuffer
		
	}
}
