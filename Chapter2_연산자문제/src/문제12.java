/*
 * 12) 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
 * 
 *   1. 변수 : int a, b;
 *   2. 초기화 : Scanner
 *   3. 연산처리  a-b, a*b
 *   4. 결과 출력
 *   
 */
import java.util.Scanner;
public class 문제12 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int a = Sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int b = Sc.nextInt();
		
		System.out.printf("뺄셈 : %d - %d = %d\n", a, b, a-b);
		System.out.printf("곱셈 : %d * %d = %d\n", a, b, a*b);
	}
}
