package com.sist.io;
/*
 *    = 변수, 연산자, 제어문
 *    = 객체지향프로그램
 *    = 예외처리
 *    ------------------------- 문법 사항
 *    = 라이브러리
 *      => 자바 라이브러리
 *      => 오라클 관련(라이브러리)
 *      => Web 관련 라이브러리
 *      => 스프링 관련 라이브러리
 *      => 기타 외부 (Jsoup, Json...)
 *    ------------------------------ Back-End
 *    Front-End
 *    --------- HTML/CSS/Javascript
 *                           |
 *                        JQuery(AJAX)
 *                        VueJS --------------> Vue3, Vuex
 *                        ReactJS ------------> Redux, Mobx
 *                        TypeScript
 *    
 *    IO => Input / Output
 *          --------------
 *            |       |
 *           입력     출력
 *           => 입출력시 사용하는 라이브러리
 *           1) 메모리 입출력: 표준입출력
 *           2) 파일 입출력: Web에서 업로드/다운로드
 *              예) xml, json, txt, csv
 *           3) 네트워크 입출력: 웹서버에 구현되어있음
 *           
 *    자바에서 입출력하기 위한 장치 : 스트림(데이터가 이동하는 통로)
 *    데이터 이동
 *    --------
 *     1byte 이동,       2byte 이동
 *     ---------        ---------
 *     ~InputStream     ~Reader
 *     ~OutputStream    ~Writer
 *     -------------    ---------
 *      바이트 스트링       문자 스트림
 *   => byte
 *   => read(), write()
 *   => IO => CheckedException => 예외처리가 기본
 *         => IO 라이브러리 사용시 => 반드시 닫기 => close()
 *         
 *    지원 라이브러리
 *    FileInputStream   FileOutput
 *    FileReader        FileWriter
 *    ----------------------------
 *    ObjectInputStream ObjectOutputStream => 객체단위 저장
 *    
 *    Buffer => 일시적으로 데이터를 저장했다가 한번에 전송
 *           => 속도가 빠름
 *           => BufferedReader, BufferedWriter
 *              --------------  --------------
 */
import java.io.*;
import java.util.*;
public class 입출력_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			long start = System.currentTimeMillis();
			fis = new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			fos = new FileOutputStream("c:\\java_datas\\eclipse1.zip");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int i=0;
			byte[] buffer = new byte[1024];
			while((i=bis.read(buffer, 0, 1024))!=-1) {
				bos.write(buffer, 0, 1024);
			}
			long end = System.currentTimeMillis();
			
			System.out.println(String.format("파일 복사 시간: %.2f초", (end-start)/1000.0));
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
