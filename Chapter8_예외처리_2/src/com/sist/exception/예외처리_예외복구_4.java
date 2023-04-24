package com.sist.exception;
/*
 *   배열에 데이터를 저장 => 배열범위 초과
 *   나누기를 처리 => 0
 *   기타 예외처리 => 통합
 *   ----------------- RuntimeException
 *   
 *   Exception은 클래스 계층구조로 이루어져있기때문에 다형성을 통해 여러 예외들에 대해 한번에 다룰 수 있다!!!
 *   
 *   ** 다중 catch문을 사용할 때는 Exception class의 계층관계를 고려해야한다
 *   한 Exception의 상위 클래스가 해당 Exception 클래스보다 먼저 나오면 안됨!
 */
public class 예외처리_예외복구_4 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			arr[0]=10;
			arr[1]=2;
			System.out.println(arr[0]/arr[1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		} catch(RuntimeException e) {
			System.out.println("예측 못한 에러!");
		}
		System.out.println("프로그램 종료");
	}
}
