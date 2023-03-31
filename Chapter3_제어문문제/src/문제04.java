//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
//      합계와 평균을 구해보자.
import java.util.Scanner;

public class 문제04 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("세 개의 정수 입력: ");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		
		int total = a + b + c;
		double avg = (double)total / 3;
		
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		int min = a;
		if(b < min)
			b = min;
		if(c < min)
			c = min;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합 계 : " + total);
		System.out.printf("평 균 : %.2f", avg).println();
	}
}
