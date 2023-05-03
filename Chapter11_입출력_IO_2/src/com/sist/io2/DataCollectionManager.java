package com.sist.io2;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;

public class DataCollectionManager {
	public static void main(String[] args) {
		List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fos=new FileOutputStream("c:\\java_datas\\genie_music.txt"));
			// 사이트 연결
			String[] urls= {
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
			};
			int k=1;
			for(int i=0;i<urls.length;i++) {
				Document doc = Jsoup.connect(urls[i]).get();
				Elements title = doc.select("table.list-wrap td.info a.title");
				Elements singer = doc.select("table.list-wrap td.info a.artist");
				Elements album = doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster = doc.select("a.cover img");
				Elements etc = doc.select("span.rank");
				
				for(int j=0;j<title.size();j++) {
					System.out.println("고유번호:"+k);
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));
					String s = etc.get(j).text();
					String state="", id="";
					if(s.equals("유지")) {
						state=s;
						id="0";
					}
					else if(s.contains("하강")){
						state="하강";
						id=s.substring(0, s.indexOf("하강"));
					}
					else if(s.contains("상승")){
						state="상승";
						id=s.substring(0, s.indexOf("상승"));
					}
					else if(s.equals("new")) {
						state="new";
						id="0";
					}
					System.out.println("상태:"+state);
					System.out.println("증감:"+id);
					String key = youtubeKeyData(title.get(j).text());
					System.out.println("동영상:"+key);
					System.out.println("===========================");
					
					GenieMusicVO gn = new GenieMusicVO();
					gn.setNo(k++);
					gn.setCno(i+1);
					gn.setTitle(title.get(j).text());
					gn.setSinger(title.get(j).text());
					gn.setAlbum(title.get(j).text());
					gn.setPoster(title.get(j).text());
					gn.setState(state);
					gn.setIncrement(Integer.parseInt(id));
					gn.setKey(key);
					
					list.add(gn);
				}
			}
			oos.writeObject(list);
			System.out.println("저장완료!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static String youtubeKeyData(String title) {
		String key = "";
		try {
			String url = "https://www.youtube.com/results?search_query="+URLEncoder.encode(title,"UTF-8");
			Document doc = Jsoup.connect(url).get();
			String data=doc.toString();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m = p.matcher(data);
			while(m.find()) {
				String s=m.group();
				s=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				key=s;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
	}
}
