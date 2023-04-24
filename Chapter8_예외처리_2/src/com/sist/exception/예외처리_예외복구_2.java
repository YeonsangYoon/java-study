package com.sist.exception;
/*
 *   *** 예외를 수정하는 것이 아니다 => 에러발생한 소스를 건너뛴다
 *   형식
 *   ---
 *     try {
 *        문장1
 *        문장2 ==> 예외발생 => catch로 이동
 *        문장3
 *     } catch(예외처리 종류) {
 *        문장4
 *     }
 *     문장5
 *     문장6
 *     
 *   처리순서
 *   예외 발생 x : 1=>2=>3=>5=>6
 *   예외 발생 o : 1=>2=>4 (문장2에서 발생)
 *     
 *   try안에서 에러발생시에 에러난 위치부터 try끝까지는 수행하지 않는다
 *   catch로 이동 => catch문장을 수행한다
 */
public class 예외처리_예외복구_2 {
	public static void main(String[] args) {
		// 평문
//		System.out.println("문장1");
//		System.out.println("문장2");
//		System.out.println("문장3:"+10/0); // 비정상 종료 수행
//		System.out.println("문장4");
//		System.out.println("문장5");
		
		System.out.println("문장1");
		System.out.println("문장2");
		try {
			System.out.println("문장3");
			System.out.println("문장4");
			int[] arr =new int[2];
			arr[2]=100;
			System.out.println("문장5:"+arr[2]); // 예외 발생
			System.out.println("문장6");
		} catch(ArithmeticException e) { // 에러처리시 => 0으로 나눌 경우만 처리가 가능
			System.out.println("문장7");
		}
		System.out.println("문장8");
		System.out.println("프로그램 종료");
	}
}
