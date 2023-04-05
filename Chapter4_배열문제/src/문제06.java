import java.util.Scanner;
public class 문제06 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 정수입력:", i+1);
			arr[i] = Sc.nextInt();
		}
		
		for(int i : arr) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
	}
}
