package com.sist.main;
import static java.lang.Math.random;
/*
 *   import 패키지명.클래스명
 *   import 패키지명.*
 *   import static java.lang.Math.random;
 *   java.lang.* => 자동 로딩이 된다, import를 사용하지 않는다
 *   ---------- String, Math
 */
// Math 클래스는 지원하는 모든 메소드가 static
public class 클래스_메소드 {
	public static void main(String[] args) {
		int a = (int)(random()*100+1);
		System.out.println(a);
	}
}
