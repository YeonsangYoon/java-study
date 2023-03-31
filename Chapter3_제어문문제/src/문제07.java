//문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
//      작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
//      나머지는 F)
import java.util.Scanner;

public class 문제07 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("세 점수 입력:");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		
		int total = a + b + c;
		double avg = (double)total / 3;
		int tmp = (int)avg;
		char grade = 'F';
		
		if(tmp >= 90)
			grade = 'A';
		else if(tmp >= 80)
			grade = 'B';
		else if(tmp >= 70)
			grade = 'C';
		else if(tmp >= 60)
			grade = 'D';
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg).println();
		System.out.println("학점 : " + grade);
	}
}
