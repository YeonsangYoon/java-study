// 사용자의 입력을 받아서 구구단을 출력
import java.util.Scanner;
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = Sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
}
