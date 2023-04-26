package com.sist.lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *   Wrapper : 전체를 감싼다
 *   프로그램 개발시 => 기본 타입 데이터형을 객체단위로 저장할 때
 *   
 *   List<int> => 오류
 *        --- 클래스형
 *   List<Integer>
 *   => 기본형을 클래스화 해서 사용
 *   
 *      기본형       클래스형
 *    - int         Integer
 *    - long        Long
 *    - byte        Byte
 *    - double      Double
 *    - boolean     Boolean
 */
public class 라이브러리_Wrapper_1 {
	static void display(Integer i1, Integer i2) {
		System.out.println(i1 +" "+ i2);
	}
	public static void main(String[] args) {
		String s = "4.3";
		double d = Double.parseDouble(s);
		// 사용처 => 문자열을 원하는 데이터형으로 변경할때 주로 사용
		// 윈도우 / 브라우저 / 핸드폰에서 모든 데이터형을 문자열로 사용 
		// => 이를 기본 데이터형으로 바꾸기 위해 Wrapper 클래스를 만들었다(?)
		// 클래스명 : 객체단위로 저장
		// 문자열 => 해당 데이터형으로 변환 => Double.parseDouble 사용(static 메소드)
		// 오토박싱 / 언박싱
		/*
		 *   오토박싱 => 클래스에 기본타입을 대입
		 *   Integer i = 10;
		 *   오토언박싱 => 기본타입에 Wrapper 클래스를 대입 
		 *   int a = i;
		 */
		
		Integer i = 10; // 오토박싱
		int a = i; // 오토언박싱
		i = 20;
		/*
		 * void display(Integer i1, Integer i2)
		 * => display(10, 20) 이렇게 호출 가능
		 */
		display(10, 20);
		
//		List<int> list = new ArrayList<int>(); => 오류
		List<Integer> list = new ArrayList<Integer>();
		
		/*
		 * 1. 문자열을 해당 데이터형으로 변환
		 *    문자열 => 정수형 Integer.parseInt()
		 *    문자열 => 실수형 Double.parseDouble()
		 *    문자열 => 논리형 Boolean.parseBoolean()
		 * 2. 객체단위로 저장할때가 있다(자료구조 => Collection)
		 */
	}
}
