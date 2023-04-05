import java.util.Scanner;
public class 문제08 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		// 5개의 정수를 입력받은 후 차례로 출력하는 프로그램
		int[] arr = new int[5];
		System.out.print("5개의 정수 입력:");
		for(int i=0;i<5;i++) {
			arr[i]=Sc.nextInt();
		}
		for(int i:arr)
			System.out.print(i + " ");
	}
}
