package com.sist.exception;
/*
 *    에러 => 컴파일(javac) / 실행시 (java)
 *           -----------   -----------
 *           Check          UnCheck
 *             |               |
 *   자바문법(반드시 예외처리)      생략
 *   
 *   = 수정이 불가능한 에러(심각한 오류) : 메모리 부족, 윈도우 덤프 Error
 *   = 수정이 가능한 에러(가벼운 오류) : 소스상에서 수정이 가능
 *      => 파일읽기(파일명이 틀리다), 배열 인덱스를 벗어난 경우
 *      => 웹 연결(url이 틀리다)
 *      => Exception (예외처리)
 *   
 *   에러가 발생
 *   ---------
 *   1. 프로그래머의 실수
 *      => 초기화값이 없는 상태에서 비교
 *      => 배열인덱스 오류
 *      => 무한루프
 *      => 파일명 오류
 *   2. 사용자 입력 오류
 *      => 계산기 나누기 0입력
 *      => 정수 입력인데 문자열 입력
 *      ----------------------- 웹에서 유효성 검사
 *      
 *   예외처리 : 견고한 프로그램을 만들기 위해 사용
 *            ------------ 비정상을 방지하고 정상상태 유지
 *            ------------ 사전에 에러를 방지하는 프로그램
 *   1. 예외처리 방식
 *     = if문
 *     = 복잡한 에러, if로 해결이 불가능
 *       웹 : 404, 500, 415, 400, 403 등...
 *   2. 예외처리 종류
 *     = 복구 : try ~ catch 
 *           try {
 *               int a = 10;
 *               int b = 0;
 *               double d = (double)a/b;
 *               System.out.println(d);
 *           } catch(Exception e) {
 *               에외 발생시 수행하는 문장
 *           }
 *           
 *     = 회피 : throws
 *     = 예외발생 : throw(테스트시)
 *     = 사용자 정의 예외 : 지원하지 않는 예외가 존재
 *     
 *   예외처리의 계층 구조
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
	 *                  java.io => 클래스가 동일                 |
	 *              SQLException(오라클 연동)            NumberFormatException
	 *                  java.sql => (네트워크 통신)
	 *                  자바응용프로그램 => 오라클
	 *              ClassNotFoundException
	 *                  => 클래스명이 틀린 경우
 *   
 *   예외의미 : 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시
 *   프로그램은 에러시에 비정상적으로 종료 => 방지하고 정상적으로 종료가 가능하게 만드는 과정
 *   
 */
public class 예외처리_1 {
	public static void main(String[] args) {		
		int a = 10;
		int b = 0;
		
		if(b!=0) {
			int c = a/b;
			System.out.println("c="+c);
		}
		else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		// 1. 정상적으로 종료가 되게 만든다
		// 2. 우선적 => if문으로 처리가 가능한지? => java에서 제공하는 예외처리를 이용한다
		// 3. if는 주로 사용하는 게 => 검색용도, 사용자 입력 제한...
		
		try {
			Class.forName("com.sist.exception.예외처리_1");
		}catch(Exception ex) {}
	}
}
