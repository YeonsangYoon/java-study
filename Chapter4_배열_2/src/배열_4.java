// 16비트 => 0, 1
import java.util.Arrays;
import java.util.Scanner;
public class 배열_4 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		// 저장 공간 (0, 1)
		int num = Sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		
		int[] binary = new int[16];
		int index = 15;
		
		for(int i=15;i>=0;i--) {
			if((1<<i) <= num) {
				binary[15-i]=1;
				num -= (1<<i);
			}
		}
		for(int i : binary)
			System.out.print(i);
	}
}
