package com.sist.exception;

import java.util.Collection;

/*
 *   267pg => try~catch(예외복구)
 *   
 *     try : 정상실행하는 블럭
 *     catch : 에외가 발생시에 복구하는 과정(여러개 사용이 가능 => 순서) => 계층구조
 *     ---------------------------------------------------------------
 *     예외처리 => 소스상에서 수정이 가능한 에러(가벼운 에러)
 *     ------ 사전에 에러를 방지하는 프로그램
 *            비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 *            
 *     계층구조(상속도)
 *                         Object
 *                           |
 *                       Throwable
 *                           |
 *                 -----------------------
 *                 |                     |
 *               Error               Exception
 *                                       |
 *                      -----------------------------------
 *                      |                                 |
 *               CheckException                   UnCheckException
 *                      |                                 |
 *              IOException(입출력)                 RuntimeException
 *              SQLException(오라클 연동)            NumberFormatException
 *              ClassNotFoundException 
 *                  
 *    Object : 모든 클래스의 상위 클래스(모든 클래스는 Object의 자식)
 *    Throwable : 에러의 최상위 클래스
 *    Error : 처리가 부족
 *       = 메모리 부족
 *       = 윈도우 충돌
 *    Exception : 처리가 가능
 *       = 0으로 나누는 경우
 *       = 정수변환의 문제
 *       = 형변환, 파일명이 틀린 경우
 *       = Web에서 URL/IP가 틀린 경우
 *       = 주소가 null인 객체에 접근하는 경우
 *    CheckedException : 컴파일시에 예외처리를 했는지 여부 확인(반드시 예외처리 해야함)
 *    IOException : 파일 입출력, 메모리 입출력, 네트워크 입출력
 *       = java.io
 *    SQLException : 오라클 연결(오라클이 인식하는 언어:SQL)
 *       = JDBC ==> DBCP ==> ORM (MyBatis, JPA)
 *       = Web = 핵심(데이터베이스 연결)
 *    MalformedURLException : IP/Web URL
 *       = java.net
 *    ClassNotFoundException : 클래스이름으로 메모리 할당 시 클래스명, 패키지가 틀리는 경우
 *    = 스프링에서 주로 사용하는 기술 (리플렉션) => private까지 접근이 가능
 *    
 *    InterruptedException : 쓰레드(프로세스안에서 여러개의 작업을 동시에 사용), 충돌과 관련
 *    
 *    ** 예외처리는 필수 : 정상상태를 유지 => 견고한 프로그램
 *    
 *    UnCheckedException : 컴파일시에 예외처리를 확인하지 않는다(필요시에만 예외처리)
 *    RuntimeException : 실행시 (인터프리터) => 사용자 입력, 프로그램 실수
 *    NumberFormatException : 정수 변환에서 에러
 *       = Wrapper : 기본형을 사용하기 쉽게 클래스형으로 제작(Integer, Boolean)
 *       = Integer.parseInt(" 10"); => 윈도우/Web(문자열만 사용)
 *          웹에서 전송된 데이터를 받는 경우
 *          -------------------------
 *           String getParameter() => 정수
 *          Jsoup : 데이터 수집(String)
 *    ArrayIndexOutOfBoundsException : 배열범위 초과
 *    ArithmeticException : 0으로 나눌 경우
 *    NullPointerException : 객체나 배열에 주소가 없는 경우
 *    ClassCastException : 클래스 형변환이 잘못된 경우(다운캐스팅할때)
 *    
 *    예외처리의 기본
 *    try ~ catch
 *    -----------
 *    형식)
 *        try {
 *           정상수행이 가능한 코딩 => 지금까지 소스가 들어간다
 *        }
 *        catch(예외처리 종류 설정) {
 *           수행과정에서 오류발생시 처리되는 부분
 *        }
 *    -----------------------------------------------
 *    try ~ catch => 소스 전체 처리 : 종료
 *                   -----------
 *                   부분 처리 : 제외
 *    try문의 위치에 따라 실행 방법에도 차이가 생긴다
 *    
 */

public class 예외처리_예외복구_1 {
	public static void main(String[] args) {
//		try {
//			for(int i=1;i<=10;i++) {
//				int j=(int)(Math.random()*3);
//				int k = i/j;
//				System.out.println("k="+k);
//			}
//		} catch (Exception ex) {
//			System.out.println("0으로 나눌 수 없다");
//		}
		for(int i=1;i<=10;i++) {
			try {
				int j=(int)(Math.random()*3);
				int k = i/j;
				System.out.println("k="+k);
			} catch (Exception ex) {
				System.out.println("0으로 나눌 수 없다");
			}
		}
	}
}
