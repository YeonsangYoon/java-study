package com.sist.project;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
public class DataCollection {
	public static void main(String[] args) throws Exception{
		List<LectureVO> list = new ArrayList<LectureVO>();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\java_datas\\InfearnData.txt"));
		String u = "https://www.inflearn.com";
		String urls[] = {
				"https://www.inflearn.com/courses/it-programming/web-dev",
				"https://www.inflearn.com/courses/it-programming/back-end",
				"https://www.inflearn.com/courses/it-programming/full-stack",
				"https://www.inflearn.com/courses/it-programming/mobile-app",
				"https://www.inflearn.com/courses/it-programming/programming-lang?order=seq",
				"https://www.inflearn.com/courses/it-programming/algorithm?order=seq"
		};
		
		int k=1;
		for(int i=0;i<urls.length;i++) {
			Document doc = Jsoup.connect(urls[i]).get();
			Elements title = doc.select("div.card-content div.course_title");
			Elements content = doc.select("div.course_card_back p.course_description");
			Elements price = doc.select("div.price");
//			Document doc2 = Jsoup.connect(u+doc.select("a.course_card_front").attr("href")).get();
//			Elements star = doc.select("div.star_solid");
			Elements teacher = doc.select("div.instructor");
			Elements poster = doc.select("div.card-image img");

			for(int j=0;j<title.size();j++) {
				System.out.println("고유번호:"+k);
				System.out.println("카테고리 번호:"+(i+1));
				System.out.println(title.get(j).text());
				System.out.println(content.get(j).text());
				System.out.println(price.get(j).text());
				System.out.println(teacher.get(j).text());
				System.out.println(poster.get(j).attr("src"));
				System.out.println("===============================");
				
				LectureVO vo = new LectureVO();
				vo.setId(k++);
				vo.setCno(i+1);
				vo.setTitle(title.get(j).text());
				vo.setContent(content.get(j).text());
				String p = price.get(j).text();
				String pArr[] = p.split(" ");
				vo.setPrice(pArr[pArr.length-1]);
				vo.setTeacher(teacher.get(j).text());
				vo.setPoster(poster.get(j).attr("src"));
				
				list.add(vo);
				
			}
		}
		oos.writeObject(list);
	}
}
