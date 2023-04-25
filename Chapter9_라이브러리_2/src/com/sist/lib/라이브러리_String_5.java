package com.sist.lib;

import java.lang.reflect.Array;
import java.util.Arrays;

// concat : 문자열 결합
/*
 *   String s1 = "Hello ";
 *   String s2 = "Java";
 *   s1.concat(s2); => "Hello Java"
 */
// endsWith : 끝나는 문자열이 같은 경우에 사용
/*
 *   boolean endsWith(String s) => 해당 클래스의 문자열이 s로 끝나는 경우 true 리턴
 *   
 *   charAt()
 *   equals():대소문자 구분, equalsIgnorecase():대소문자 구분x
 *   indexOf(), lastIndexOf() --- 뒤에서부터 찾는다
 *   ------ 위치확인(문자/문자열)
 *   ------ 앞에서부터 찾기
 *   length() : 문자의 개수
 *   startsWith() : 시작문자열이 같은 경우(검색 자동완성)
 *   substring() : 시작문자열이 같은 경우
 *   trim() : 공백 제거
 *   split() : 특정문자로 자르는 경우
 *   contains() : 포함문자열인지 확인
 *   valueOf() : 모든 데이터형을 문자열 반환
 *   
 *   
 *   1-4
 *   2-3
 *   3-4
 */
public class 라이브러리_String_5 {
	public static void main(String[] args) {
//		String s1 = "Hello ";
//		String s2 = "Java";
//		System.out.println(s1.concat(s2));
//		
//		String s3 = "ava";
//		
//		if(s1.endsWith("o"))
//			System.out.println("o로 끝난다");
//		else
//			System.out.println("o로 끝나지 않았다");
		
		String[] data = {"JAVA", "java", "Java", "JAva", "JAVa", "jaVA", "javA"};
		for(String s:data) {
			// equals는 대소문자를 구분해서 비교
			// 원형 : boolean equals(String s)
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		System.out.println("========");
		for(String s:data) {
			// equalsIgnoreCase : 대소문자를 구분하지 않고 비교
			// 원형 : boolean equalsIgnoreCase(String s)
			if(s.equalsIgnoreCase("java")){
				System.out.println(s);
			}
		}
		
		System.out.println("======== length() ========");
		String rawData = "apple 사과\r\n"
				+ "  avocado 아보카도\r\n"
				+ "  banana 바나나\r\n"
				+ "  blackberry 블랙베리\r\n"
				+ "  blueberry 블루베리\r\n"
				+ "  cherrytomato 체리 토마토, 방울 토마토\r\n"
				+ "  cherry 체리\r\n"
				+ "  coconut 코코넛\r\n"
				+ "  grape 포도\r\n"
				+ "  kiwi 키위\r\n"
				+ "  lemon 레몬\r\n"
				+ "  lime 라임\r\n"
				+ "  mango 망고\r\n"
				+ "  melon 멜론\r\n"
				+ "  orange 오렌지\r\n"
				+ "  papaya 파파야\r\n"
				+ "  peach 복숭아\r\n"
				+ "  pear 배\r\n"
				+ "  persimmon 곶감\r\n"
				+ "  pineapple 파인애플\r\n"
				+ "  plum 자두\r\n"
				+ "  strawberry 딸기\r\n"
				+ "  tangerine 귤\r\n"
				+ "  tomato 토마토\r\n"
				+ " watermelon 수박";
		String[] data2 = rawData.split("\r\n");
		for(int i=0;i<data2.length;i++) {
			data2[i]=data2[i].trim().split(" ")[0];
			System.out.println(data2[i]);
		}
		
		int maxIdx=0;
		for(int i=1;i<data2.length;i++) {
			if(data2[maxIdx].length() < data2[i].length())
				maxIdx=i;
		}
		System.out.println("======================");
		System.out.println("가장 긴 이름의 과일명을 출력하시오");
		System.out.println(data2[maxIdx]);
		
		
		System.out.println("======== startsWith() ========");
		// 시작문자열이 같은 경우
		// 원형 : boolean startswith(String s)
		for(String s : data2) {
			if(s.startsWith("p")) {
				System.out.println(s);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("======== trim() ========");
		// trime() : 좌우 공백 제거
		// 원형 : String trim()
		String id = "admin";
		if(id.equals(" admin".trim()))
			System.out.println("같은 ID 입니다");
		else
			System.out.println("다른 ID 입니다");
		
		System.out.println("======== contains() ========");
		// contains : 포함문자열을 찾을 경우
		// 원형 : boolean contains(String s)
		for(String s : data2) {
			if(s.contains("a"))
				System.out.println(s);
		}
		
		System.out.println("======== valueOf() ========");
		// valueOf : String에서 유일한 static 메소드
		// 모든 데이터형을 문자열로 변환
		// 원형 : static String valueOf((type)) => 오버로딩된 상태
		System.out.println(String.valueOf(10)+String.valueOf(30));
		
		System.out.println("======== substring() ========");
		// substring()은 indexOf(), lasIndexOf()와 자주 쓰인다
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res = ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		res = ss.substring(ss.indexOf("/")+2, ss.indexOf("/J"));
		System.out.println(res);
		ss = "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res = ss.substring(0,ss.indexOf("지")-1);
		System.out.println(res);
		res = ss.substring(ss.indexOf("지")+3);
		System.out.println(res);
		// substring() : 문자열을 자르는 경우
		// 오버로딩
		// substring(int s) ==> s번째부터 마지막까지
		// substring(int s, int e) => s부터 e-1까지 잘라온다
		// 원형 : String substring(int s)
		//       String substring(int s, int e)
		ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");
		for(String s:names) System.out.println(s);
		// 구분자별로 잘라서 배열에 저장...
		// 원형 : String[] split(String s)
		
		ss = "갈비살\r\n"
				+ "30,000원\r\n"
				+ "돼지갈비\r\n"
				+ "17,000원\r\n"
				+ "돼지목살\r\n"
				+ "15,000원\r\n"
				+ "삼겹살\r\n"
				+ "15,000원";
		String menu[] = ss.split("원");
		for(String s:menu) System.out.println(s);
		
		// | 정규식에서 사용하는 기호
		// | ? . + * ^
		ss = "red|blue|green|black|white|yellow";
		String[] color = ss.split("\\|"); 
		for(String s : color)
			System.out.println(s);
		
		System.out.println("========== replace() ==========");
		// replace() : 문자/문자열 변경
		ss="https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		System.out.println(ss.replace('&', '#'));
	}
}
