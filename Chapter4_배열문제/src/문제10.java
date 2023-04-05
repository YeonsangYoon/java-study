import java.util.Scanner;
public class 문제10 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("10개의 정수 입력:");
		for(int i=0;i<10;i++) {
			arr[i]=Sc.nextInt();
		}
		
		System.out.printf("%d %d %d", arr[2], arr[4], arr[9]);
	}
}
