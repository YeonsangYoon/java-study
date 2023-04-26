package com.sist.util;
// Date => Calendar
import java.util.*;
public class 라이브러리_Calendar_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = sc.nextInt();
		System.out.print("월 입력:");
		int month = sc.nextInt();
		System.out.print("일 입력:");
		int day = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("=============== 설정된 날짜 ==============");
		System.out.println("년도"+cal.get(Calendar.YEAR));
		System.out.println("월"+(cal.get(Calendar.MONTH)+1));
		System.out.println("일"+cal.get(Calendar.DATE));
		System.out.println("요일:"+week[cal.get(Calendar.DAY_OF_WEEK)]);
	}
}
