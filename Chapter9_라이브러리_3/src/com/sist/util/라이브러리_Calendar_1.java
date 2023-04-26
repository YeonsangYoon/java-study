package com.sist.util;

import java.util.Calendar;

/*
 *    Calendar : Date클래스를 보완해서 새롭게 만든 클래스
 *    1) Calendar 생성
 *       Calendar cal = Calendar.getInstance();
 *       -------- Calendar는 추상클래스 new를 이용해서 객체 생성을 못함
 *    2) 날짜 설정 => set()
 *    3) 날짜 읽기 => get()
 *    4) 각달의 마지막날
 *       getActualMaxium()
 *    5) 요일 읽기
 *       get()
 */
public class 라이브러리_Calendar_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getClass());
		
		System.out.println("년도:"+cal.get(Calendar.YEAR));
		System.out.println("월:"+(cal.get(Calendar.MONTH)+1));
		System.out.println("일:"+cal.get(Calendar.DATE));
		System.out.println("시:"+cal.get(Calendar.HOUR));
		System.out.println("분:"+cal.get(Calendar.MINUTE));
		System.out.println("초:"+cal.get(Calendar.SECOND));
		System.out.println("이번달 마지막날:"+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("요일:"+week[cal.get(Calendar.DAY_OF_WEEK)]);
	}
}
