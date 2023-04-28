package com.sist.lib;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 라이브러리_Set_3 {
	private static String genieUrl = "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg=2&pg=1";
	private static String melonUrl = "https://www.melon.com/chart/index.htm";
	
	public static Set melonMusic() {
		Set set = new HashSet();
		try {
			Document doc = Jsoup.connect(melonUrl).get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
			
		} catch (Exception e) {e.printStackTrace();}
		return set;
	}
	public static Set genieMusic() {
		Set set = new HashSet();
		try {
			Document doc = Jsoup.connect(genieUrl).get();
			Elements title = doc.select("tr.list td.info a.title");
			
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
		
		} catch (Exception e) {e.printStackTrace();}
		return set;
	}
	public static void main(String[] args) {
		Set genie = genieMusic();
		Set melon = melonMusic();
		
		// genie 뮤직에만 있는 노래 찾기
//		genie.removeAll(melon); // 차집합 : [1, 2, 3, 4, 5] - [1, 2, 3, 6, 7] => [4, 5]
//		for(Object o : genie) {
//			System.out.println(o.toString());
//		}
		
		melon.retainAll(genie); // 교집합
		System.out.println("멜론과 지니뮤직의 동일한 곡:"+melon.size());
		for(Object o : melon) {
			System.out.println(o.toString());
		}
	}
}
