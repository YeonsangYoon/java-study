package com.sist.main3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GenieMusicSystem {
	private static Music[] musics=new Music[50];
	// 1. 초기화
	/*
	 *   인스턴스 블록
	 *   static 블록
	 *   --------------------- 자동 호출
	 *   생성자 
	 *   
	 *   예외처리
	 *     = 에러 : 소스상에서 처리할 수 없는 심각한 에러(ex. 메모리 공간 부족)
	 *     = 예외 : 수정이 가능한 에러
	 *        => 예외 복구
	 *        => 예외 회피
	 */
	static {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// 문서 저장 공간 => HTML
			System.out.println(doc.toString());
		} catch(Exception ex) {}
	}
	
	public static void main(String[] args) {
		GenieMusicSystem gn = new GenieMusicSystem();
	}
}
