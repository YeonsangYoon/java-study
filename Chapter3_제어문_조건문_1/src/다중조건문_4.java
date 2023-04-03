// 성적 계산 ==> A+(97이상), A0, A-
import java.util.Scanner;
public class 다중조건문_4 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("세개의 정수 입력:");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		int total = a+b+c;
		int avg = total/3;
		
		
		System.out.println("국어점수: " + a);
		System.out.println("영어점수: " + b);
		System.out.println("수학점수: " + c);
		
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", total/3.0);
		
		char score = 'F';
		char option = '-';
		
		if(avg >= 90)
			score = 'A';
		else if (avg >= 80)
			score = 'B';
		else if (avg >= 70)
			score = 'C';
		else if (avg >= 60)
			score = 'D';
		
		if(score == 'F')
			option = ' ';
		else if(avg % 10 >= 7)
			option = '+';
		else if(avg % 10 >= 4)
			option = '0';
			
		System.out.println("학점: " + score + option);
	}
}
