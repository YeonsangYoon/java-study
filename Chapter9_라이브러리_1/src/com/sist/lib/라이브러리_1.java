package com.sist.lib;
/*
 *    1. java.lang
 *       Object : 모든 클래스의 상위 클래스 (모든 클래스는 상속을 Object로 받는다)
 *          기능(메소드)
 *          = toString() : 객체를 문자열화 시킨다
 *          = clone() : 객체 복제(prototype)
 *              참조 : 같은 메모리를 이용(얕은 복사)
 *              복제 : 다른 메모리를 제작(깊은 복사)
 *          = finalize() : 소멸자 함수, 호출되면 메모리 해제
 *          = equals() : 객체 비교
 *       String : 문자열 저장하고 관리하는 클래스
 *          기능(메소드)
 *          = equals() : 문자열을 비교할때 사용(==은 객체의 주소값 비교)
 *          = startsWith : 시작문자열이 같은 경우
 *          = endsWith : 끝나는 문자열이 같은 경우
 *          = contains : 포함된 문자열(가장 많이 사용)
 *          = replace : 문자나 문자열을 변경할때 
 *          = replaceAll : 문자나 문자열을 변경할때(정규식) => 문자열의 형태
 *            [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} 
 *          = trim : 좌우의 공백 제거
 *          = split : 특정 단어별로 나눠서 문자열배열로 반환
 *          = length : 문자의 개수
 *          = substring : 문자열 자르는 경우
 *       StringBuffer, StringBuilder ...
 *       Wrapper : 기본형을 클래스로 감싼 클래스
 *          = Byte, Integer, Double, Boolean, Float, Long ...
 *       System
 *       Math
 *       Thread
 *       ----------------- java.lang은 import를 생략할 수 있다
 *    2. java.util
 *       Date/Calendar
 *       StringTokenizer
 *       Scanner
 *       Collection ------
 *                       |
 *              -------------------
 *              |        |        |
 *             List     Map      Set
 *              |        |        |
 *          ArrayList  HashMap   HashSet
 *          LinkedList Hashtable TreeSet
 *          Vector
 *          Stack
 *    2-1. java.text
 *    3. java.io
 *    4. java.net
 *    5. java.sql
 *    -------------------- 기본 라이브러리
 *    6. javax.xml
 *    7. javax.servlet.http
 *    8. 외부 라이브러리(자바에서 지원하는 것이 아니라 업체) 
 *       => Open API (ex. Jsoup, simple-json) : mvnrepository.com
 *       
 *    
 */
class A{
	int a=10;
	int b=20;
	@Override 
	public String toString() {
		return "a";
	}
}
public class 라이브러리_1 {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.toString());
		System.out.println(aa);
	}
}
