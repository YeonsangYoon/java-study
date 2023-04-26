package com.sist.util;
/*
 *   java.util ==> 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
 *   => 반드시 import를 사용한다(import java.util.*)
 *   
 *   1) Random : 난수 발생
 *   2) Date / Calendar : 날짜 / 시간
 *   3) StringTokenizer : 문자 분리 (split 대체)
 *   4) Collection
 *              |
 *   -----------------------
 *   |          |          |
 *  List       Set       Queue  =>  인터페이스
 *   |          |          
 *  ArrayList HashSet
 *     
 *   List : 순서가 존재, 데이터 중복을 허용
 *   Set : 순서가 없다, 데이터 중복을 허용하지 않는다
 *   Map : 순서가 없다, 저장시에 키, 값 => 동시에 저장
 *   Arrays => 배열을 제어하는 기능 (모든 필드, 메소드가 static)
 *   
 *   Random => nextInt() => int범위
 *             nextInt(5) => 0~4
 *             nextInt(101) => 0~100
 */
import java.util.*;
public class 라이브러리_Random {
	public static void main(String[] args) {
		Random r = new Random();
//		int a = r.nextInt(100)+1; // 1~100
//		System.out.println(a);
		
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = r.nextInt(100)+1;
		}
		System.out.println("====================== 정렬전 =====================");
		System.out.println(Arrays.toString(numbers));
		System.out.println("====================== 정렬후 =====================");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
}
