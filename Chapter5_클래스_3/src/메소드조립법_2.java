// 달력
import java.util.Calendar;
import java.util.Scanner;
public class 메소드조립법_2 {
	static int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	static int inputInt(String s) {	// 정수 입력
		Scanner Sc = new Scanner(System.in);
		System.out.print(s);
		return Sc.nextInt();
	}
	static int getDayOfWeek(int year, int month) { // 해당 달 1일의 요일 구하기
		int total = 1 + 365*(year-1) + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for(int i=1;i<month;i++)
			total += monthDay[i];
		return total%7;
	}
	static void printCalendar(int year, int month, int dow) { // 달력 출력
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1;i<=monthDay[month]+dow;i++) {
			if(i<=dow)
				System.out.print("  \t");
			else
				System.out.printf("%2d\t",i-dow);
			if(i%7==0)
				System.out.println('\n');
		}
	}
	static void process() {
		int year = inputInt("년도 입력:");
		int month = inputInt("월 입력:");
		
		printCalendar(year, month, getDayOfWeek(year, month));
	}
	public static void main(String[] args) {
		process();
	}
}
