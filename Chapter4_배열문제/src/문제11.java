import java.util.Scanner;
public class 문제11 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("10개의 정수 입력:");
		for(int i=0;i<10;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=1;i<10;i++)
			if(max < arr[i])
				max = arr[i];
		System.out.println("최대값:"+max);
	}
}
