import java.util.Scanner;
public class 문제1_12 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int cnt3 = 0, cnt5 = 0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d번째 정수입력:", i);
			int num = Sc.nextInt();
			if(num%3==0)
				cnt3++;
			if(num%5==0)
				cnt5++;
		}
		System.out.println("3의 배수의 개수:"+cnt3);
		System.out.println("5의 배수의 개수:"+cnt5);
	}
}
