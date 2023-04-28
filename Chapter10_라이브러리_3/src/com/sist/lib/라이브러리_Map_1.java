package com.sist.lib;
/*
 *        Map => 인터페이스
 *         |
 *     ----------
 *     |        |
 *  Hashtable  HashMap
 *  특징)
 *     Key-Value 쌍을 저장 (단, Key는 중복이 안된다)
 *     
 *     사용처 : 웹에서 제공하는 모든 클래스는 Map형식
 *     HttpServletRequest (request.setAttribute("key", "value"))
 *     HttpServletResponse
 *     HttpSession
 *     Cookie
 *  
 *     저장 / 읽기
 *     ---------
 *     저장 : put(key, value)
 *     읽기 : get(key)
 *     
 *     ArrayList => 인덱스
 *     Set => 중복없이
 *     Map => key
 *     오라클 => Primary Key
 */
import java.util.*;
public class 라이브러리_Map_1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("gender", "남자");
		map.put("age", 25);
		
		Set set = map.keySet();
		System.out.println(set);
		for(Object o : set) {
			String key = (String)o;
			System.out.println(key + ":" +map.get(key));
		}
		
		/*
		 *   clear() : 전체 삭제
		 *   get() : 실제 데이터값 읽을때
		 *   put() : 데이터 추가
		 *   isEmpty() : 데이터가 있는지 없는지 확인(true/false)
		 *   size() : 데이터 개수
		 *   values() : 실제 저장된 값들을 collection 형태로 리턴(value)
		 */
		for(Object o : map.values()) {
			System.out.println(o);
		}
	}
}
