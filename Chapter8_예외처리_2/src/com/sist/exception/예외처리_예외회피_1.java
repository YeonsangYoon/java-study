package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

// 예외 떠맡기기, 예외 회피
// => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다(알려만 주는 것) => 예외선언
// => 메소드 호출시에 반드시 => 직접, 선언
// => RuntimeException => 생략이 가능(예외처리를 안해도 된다)
/*
 *    상위 클래스를 이용해서 전체를 처리가 가능하다(상속관계를 이용한 다형성)
 *         Throwable (Exception/Error)
 *             |
 *      ------------------------
 *      |                      |
 *    Error                Exception
 *                  Check      |         UnCheck
 *                   ------------------------
 *                   |                      |
 *               IOException          RuntimeException
 *               SQLException               |
 *               ...                 NumberFormatException
 *               ...
 *               
 *    void method() throws RuntimeException
 *    void method() throws Exception
 *    void method() throws NumberFormatException, ClassCasting...
 *    void method() throws IOException
 *    void method() throws SQLException, NumberFormatException
 *    
 *    throws 뒤에는 주로 CheckedException이 붙는다
 */
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception{
		
	}
	public static void method1() throws Exception {
		methods();
	}
	public static void method2() {
		try {
			methods();
		}catch (Exception e) {
		}
	}
	public static void method3() throws IOException, SQLException, ClassCastException{
		
	}
	public static void method4() throws ClassCastException, IOException, SQLException {
		method3();
	}
	public static void method5() throws Exception {
		method3();
	}
	public static void method6() throws Throwable {
		method3();
	}
	public static void main(String[] args) {
		
	}
}
