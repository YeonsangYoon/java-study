package com.sist.lang;
/*
 *    StringBuffer
 *    1. String은 고정형 => 수정 못함(새로운 메모리를 참조해야함) => Immutable
 *    String 인스턴스가 생성되면 해당 메모리 공간은 변하지 않음
 *    반대로 StringBuffer 클래스는 메모리 생성이 완료되도 유연하게 기존 메모리를 늘리거나 줄일 수 있음
 *    
 *    
 *    2. String을 보완 => 가변형 => StringBuffer(동기) / StringBuilder(비동기)
 *    동기화를 보장하는 StringBuffer는 Thread-safe를 고려해야하는 프로그래밍시 사용
 *    단일 Thread로 실행하는 환경에서는 더 빠른 StringBuilder를 사용
 *    
 *    3. 데이터가 많은 경우 => 문자열 결합 (append)
 *    4. 문자열 처리 => 사용하는 클래스
 *    5. 처리 속도가 빠르다 (최적화)
 *    6. 주요메소드
 *       length() : 문자개수
 *       toString() : 객체를 문자열로 변환
 *                    ---------------
 *                    (String), String.valueOf()
 *       delete() : 삭제
 *       append() : 문자열 결합
 */
import java.io.*;
import java.net.*;
// => 클래스 => CheckedException
public class 라이브러리_StringBuffer {
	public static void main(String[] args) {
		try {
			StringBuffer sb = new StringBuffer();
			// Buffer : 임시 메모리
			URL url = new URL("https://www.10000recipe.com/recipe/list.html");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			if(con != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				while(true) {
					String msg = br.readLine();
					if(msg==null) break;
					sb.append(msg);
					sb.append("\n");
				}
			}
			con.disconnect();
			System.out.println(sb.toString());
		} catch (Exception e) {e.printStackTrace();}
	}
}
