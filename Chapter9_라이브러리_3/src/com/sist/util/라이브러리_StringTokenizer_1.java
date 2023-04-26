package com.sist.util;

import java.util.StringTokenizer;

/*
 *   StringTokenizer : 문자열 분리, split() => 대체
 *   
 *   기능
 *    = 생성자
 *      StringTokenizer st = new StringTokenizer("구분할 문자열") => 공백으로 자름
 *      StringTokenizer st = new StringTokenizer("구분할 문자열", 구분자)
 *    = 메소드
 *      1) countTokens() : 분리된 토큰 개수 리턴
 *      2) nextToken() : 분리된 데이터 읽기
 */
public class 라이브러리_StringTokenizer_1 {
	public static void main(String[] args) {
//		String s = "애니메이션/어드벤처/코미디";
		String s = "박서준   아이유   김종수   고창석   정승길   이현우   양현민   홍완표   허준석   이하늬";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
