package com.sist.util;

import java.util.StringTokenizer;

// 네트워크 
/*
 *     String s="red|green|blue|black|yellow";
 *     => split, StringTokenizer
 *     => StringTokenizer st = new StringTokenizer(s, "|")
 *        ------------------------------------------------
 *        String[] color = s.split("\\|") => 정규표현식 사용
 *                       => 원형 : split(String regex)
 *        ------------------------
 *              before First
 *        ------------------------
 *                red      => nextToken()
 *        ------------------------
 *                green    => nextToken()
 *        ------------------------
 *                blue     => nextToken()
 *        ------------------------
 *                black    => nextToken()
 *        ------------------------
 *                yellow   => nextToken()
 *        ------------------------
 *              after Last => nextToken() => false(읽기 종료)
 *        ------------------------
 */
public class 라이브러리_StringTokenizer_2 {
	public static void main(String[] args) {
		String s="red|green|blue|black|yellow";
		StringTokenizer st = new StringTokenizer(s, "|");
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
	}
}
