package com.sist.exception;
/*
 *    임의발생 : 테스트 목적
 *    ----------------- 배포전(상용화 전)
 *    형식)
 *       throw new 예외처리생성자()
 */
public class 예외처리_임의발생_1 {
	public static void main(String[] args) {
		try {
			int a=10;
			if(a%2==0) {
				System.out.println("임의로 예외 발생");
				throw new NumberFormatException("정수 변환이 안됨");
				// getMessage변경 => 생성자 매개변수 이용
				// throw문 밑에는 소스코딩 할 수 없다(바로 catch문으로 이동했기 때문)
			}
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		// catch절에서는 보통 에러확인
	}
}
