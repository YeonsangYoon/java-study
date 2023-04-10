//	년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
//	년도 입력 메소드
//	윤년 처리 
//	출력 

import java.util.Scanner;
public class 메소드문제3 {
	static int inputYear() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		return Sc.nextInt();
	}
	static boolean isLeapYear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		else
			return false;
	}
	static void process() {
		int year = inputYear();
		if(isLeapYear(year))
			System.out.println(year + "년도는 윤년입니다");
		else
			System.out.println(year + "년도는 윤년이 아닙니다");
	}
	
	public static void main(String[] args) {
		process();
	}
}
