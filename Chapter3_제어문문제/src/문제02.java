// 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
import java.util.Scanner;
public class 문제02 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = Sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다!");
		}
		else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다!");
		}
	}
}
