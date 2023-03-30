/*
 *    (조건)?값1:값2
 *    -----
 *     true : 값1
 *    false : 값2
 *    
 *    =====> if ~ else문과 같은 동작
 *    웹/게임같은 분야에서 자주 사용(소스를 짧게)
 *    
 *    
 */
import java.util.Scanner;

public class 삼항연산자 {
	public static void main(String[] arg) {
		Scanner Sc = new Scanner(System.in);
//		             ---  메모리에 저장
		System.out.print("정수 입력 : ");
		int num = Sc.nextInt();
		
		
		System.out.println(num%2==0 ? "짝수" : "홀수");
		
//		if(num%2==0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
	}
}
