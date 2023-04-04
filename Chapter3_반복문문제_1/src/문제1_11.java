import java.util.Scanner;
public class 문제1_11 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int cnt = 0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d번째 정수입력:", i);
			int num = Sc.nextInt();
			if(num%2==0)
				cnt++;
		}
		System.out.println("짝수의 개수:"+cnt);
	}
}
