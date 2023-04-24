package com.sist.exception;
import java.util.*;
class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String msg) {
		super(msg);
	}
}
public class 예외처리_사용자정의 {
	 public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = Sc.nextInt();
		
		try {
			if(num%2==0) {
				throw new MyException("짝수입니다!!"); // 사용자 정의는 반드시 예외를 생성해야한다
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
