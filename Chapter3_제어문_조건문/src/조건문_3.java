// 세개의 정수를 입력을 받아서 총점 / 평균 / 학점을 구해라
import java.util.Scanner;
public class 조건문_3 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner Sc = new Scanner(System.in);
		System.out.print("세개의 점수 입력 : ");
		a = Sc.nextInt();
		b = Sc.nextInt();
		c = Sc.nextInt();
		
		int total = a+b+c;
		double avg = (double)total/3;
		
		System.out.println("국어점수 : " + a);
		System.out.println("영어점수 : " + b);
		System.out.println("수학점수 : " + c);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg).println();
		
		if(avg >= 90.0)
			System.out.println("학점 : A");
		else if (avg >= 80.0)
			System.out.println("학점 : B");
		else if (avg >= 70.0)
			System.out.println("학점 : C");
		else if (avg >= 60.0)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");
	}
}
