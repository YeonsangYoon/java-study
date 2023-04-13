package com.sist.movie;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/*
 *   일별 박스 오피스 : searchMainDailyBoxOffice.do
 *   실시간 예매율 : searchMainRealTicket.do
 *   좌석 점유율 순위 : searchMainDailySeatTicket.do
 *   
 *   https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
 */

public class MovieSystem {
	Movie[] movie = new Movie[10];
	
	int menu() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("================ Menu ================");
		System.out.println("1. 일별 박스오피스");
		System.out.println("2. 실시간 예매율");
		System.out.println("3. 좌석 점유율");
		System.out.println("4. 상세 보기");
		System.out.println("9. 프로그램 종료");
		System.out.println("======================================");
		System.out.print("메뉴 선택:");
		return Sc.nextInt();
	}
	
	Movie[] movieListData(int no) {
		String[] strUrl = {
				"", 
				"searchMainDailyBoxOffice.do", 
				"searchMainRealTicket.do", 
				"searchMainDailySeatTi1cket.do"
				};
		String url=" https://www.kobis.or.kr/kobis/business/main/" + strUrl[no];
		
		try {
			Document doc = Jsoup.connect(url).get();
			String msg = doc.toString();
			msg = msg.substring(msg.indexOf("["), msg.lastIndexOf("]")+1);
			JSONParser jp = new JSONParser();
			JSONArray arr =(JSONArray)jp.parse(msg);
			for(int i=0;i<arr.size();i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				movie[i]=new Movie();
				movie[i].title = (String)obj.get("movieNm");
				movie[i].time = (String)obj.get("showTm");
				movie[i].genre = (String)obj.get("genre");
				movie[i].director = (String)obj.get("director");
				movie[i].story = (String)obj.get("synop");
				movie[i].story = movie[i].story.replace("&lt;", "<");
				movie[i].story = movie[i].story.replace("&gt;", ">");
			}
		} catch(Exception ex) {}
		return movie;
	}
	
	Movie movieDetailData(int no) {
		return movie[no-1];
	}
}
