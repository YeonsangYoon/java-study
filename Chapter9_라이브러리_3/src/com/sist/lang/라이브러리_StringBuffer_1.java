package com.sist.lang;

public class 라이브러리_StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동입니다.");
		sb.delete(3, 6); // delete(int s, int e) => s ~ e-1 인덱스 문자를 삭제
		System.out.println(sb.toString());
		sb.insert(3, "입니다"); // insert(int offset, string s) => offset 인덱스 위치에 s를 추가
		System.out.println(sb.toString());
		System.out.println(sb.substring(3));
	}
}
