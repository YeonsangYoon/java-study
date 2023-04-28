package com.sist.lib;
/*
 *    컬렉션 프레임워크
 *    -------------
 *    1. 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 *                    --------------- 자바에서 라이브러리로 지원
 *    2. 데이터 => 읽기, 수정, 삭제, 추가 (자료구조)
 *    3. 배열 => 크기가 정해져 있음(추가, 삭제 어려움)
 *              -------------- 추가가 될떄마다 자동으로 메모리 추가
 *    4. 컬렉션의 종류 
 *       = 순서가 존재, 데이터 중복허용
 *         List (인터페이스)
 *          |
 *         ArrayList, Vector, LinkedList
 *       = 순서가 없고, 데이터 중복허용 x
 *         Set (인터페이스)
 *          |
 *         HashSet, TreeSet(검색)
 *         ------- 웹 채팅, List에서 중복된 데이터 추출
 *       = 먼저 들어온 데이터를 먼저 출력
 *         Queue
 *       = 나중에 들어온 데이터를 먼저 출력
 *         Stack
 *       = KEY-VALUE 동시에 저장
 *         Map(인터페이스) => Collection 하위는 아님
 *          |
 *         HashMap, HashTable
 *         ------- HashTable의 단점을 보완
 *      -----------------------------------------------
 *           전체 상속도
 *           Collection
 *                |
 *        -----------------------------------------------
 *        |                     |                       |
 *       List                  Set                    Queue             Map
 *        |                     |                       |                |
 *    --- ArrayList         --- HashSet            PriorityQueue     --- HashMap
 *    --- LinkedList        --- TreeSet                              --- HashTable
 *    --- Vector
 *            |
 *          Stack
 *    
 *    1. List : 중복 데이터를 저장해야할때, 저장순서는 index를 이용함 (순서적)
 *              인덱스번호를 항상 0부터 순차적으로 유지
 *              ------------------------------
 *              배열에서의 단점 => 추가, 삭제가 안되서 새로운 배열을 생성해야함
 *              
 *        => ArrayList  
 *           1) 단방향 포인터(인덱스)를 가지고 있다, 조회하기 편리하다
 *           2) 검색이 빠르다, 데이터 추가시 속도가 빠르다
 *           3) 단점) 수정, 추가, 삭제가 느림
 *           4) 변경이 거의 없는 상태에서 주로 사용
 *        => LinkedList 
 *           1) 양방향 포인터를 가지고 있다
 *           2) 수정, 삭제, 추가가 많은 경우에 주로 사용
 *           3) 단점은 검색속도가 느리다
 *        => Vector
 *           1) 대용량 데이터 처리
 *           2) 비동기화 보완 => ArrayList
 *    
 *    2. Set : 순서가 없음 (수학적인 집합을 생각해보자) => 인덱스가 없음, 중복 허용x
 *        => HashSet : 속도가 빠르다
 *        => TreeSet : 정렬이 되어있는 상태, 검색 속도 빠름
 *   
 *    3. Map : 키(key)-값(value) 쌍으로 이루어져있음
 *        => HashMap
 *        => HashTable : HashMap보다 속도가 느리다
 *    
 *    Set 클래스(인터페이스)
 *    
 *    = HashSet(모두 같은 value값을 같은 HashMap으로 구현함)
 *      1) 순서가 없다(인덱스가 존재하지 않는다)
 *      2) 데이터중복을 허용하지 않는다
 *      3) 주요 메서드
 *       => 데이터 저장 : add() => Object
 *       => 삭제 : remove(Object) 
 *       => 전체 삭제 : clear()
 *       => isEmpty() : 빈공간(데이터 존재여부 확인)
 *       => 저장 개수 : size()
 *       => 데이터를 한번에 모아서 관리 : iterator()
 *       
 *    = TreeSet : 검색용으로 주로 사용
 */
import java.util.*;
public class 라이브러리_Collection {
	public static void main(String[] args) {
		Set set = new HashSet(); // => 타입 정의 없으면 default로 Object로 설정
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
		
		for(Object obj:set) {
			String s = (String)obj;
			System.out.print(s + " ");
		}
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println((String)object);
		}
	}
}
