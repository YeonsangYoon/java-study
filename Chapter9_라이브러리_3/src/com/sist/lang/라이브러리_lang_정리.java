package com.sist.lang;
/*
 *    java.lang => 기본 (가장 많이 사용되는 클래스의 집합)
 *    --------- import 생략 가능한 패키지
 *    - Object : 최상위 클래스 => 모든 클래스는 Object 상속
 *               ---------- 데이터형으로 사용 (가장 큰 데이터형)
 *               Object o = 10;
 *               o = 10.3;
 *               o = "";
 *               o = 'A';
 *               o = true;
 *               o = new 클래스()
 *               -------------- 여러개의 데이터형을 묶어서 관리
 *               Object[] o = {10, 10.4, 'a', "aaa", ...}
 *               => 라이브러리에 제공하는 메소드 : 리턴형 / 매개변수 => 대부분 Object
 *               => Object를 기존 클래스로 Downcasting 하는것에 유의해야한다
 *               => 기능
 *                  1) clone : 복제(새로운 메모리 생성)
 *                  2) toString : 객체를 문자열화
 *                  3) finalize : 소멸자
 *                  4) equals : 비교 (기본 => 주소값, 실제값을 비교 => 오버라이딩)
 *    - String : 문자열 저장 클래스
 *                1) length()
 *                2) substring()
 *                3) trim()
 *                4) charAt()
 *                5) replace()
 *                6) equals()
 *                7) startsWith()
 *                8) contains()
 *                9) indexOf()
 *                10) lastIndexOf()
 *                11) valueOf()
 *    - StringBuffer : 효율적인 문자열 연산시 (ex. append())
 *    - Wrapper : 기본형을 클래스화 시킨 클래스 집합
 *                1) int => Integer                                                                                  
 *                2) long => Long
 *                3) double => Double
 *                4) boolean => Boolean
 *    - Math : 수학과 관련된 라이브러리(모든 필드, 메소드가 static임)
 *        = random() : 난수발생
 *        = ceil() : 올림메소드 => 총페이지 구하기
 *        = round()
 *    - System
 *        = System.currentTimeMillis() : 실제 시간을 => long
 *        = System.gc() : 가비지 콜렉션 호출(메모리 회수)
 *        = System.out : 화면 출력
 *        = System.in : 키보드 입력
 */
import java.util.*;
public class 라이브러리_lang_정리 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		
		String a = list.get(0);
	}
}
