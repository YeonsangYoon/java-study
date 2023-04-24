package com.sist.exception;
/*
 *    문자열로 2개의 정수를 받아서 정수로 변환한 후에 : NumberFormatException
 *    배열에 저장 : ArrayIndexOutOfBoundsException
 *    나누기 한값을 구한다 : ArithmeticException
 */
import java.util.*;
public class 예외처리_예외복구_3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		String num1 = Sc.next();
		
		System.out.print("두번째 정수 입력:");
		String num2 = Sc.next();
		
		int[] arr = new int[2];
		
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			arr[0]=n1;
			arr[1]=n2;
//			arr[2]=n2;
			
			int result = arr[0]/arr[1];
			
		} catch(NumberFormatException e) {
			System.out.println("정수 변환 에러 발생!!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과한 에러 발생!!");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}
		System.out.println("프로그램 종료!!"); // 출력 => 정상 종료
	}
}
