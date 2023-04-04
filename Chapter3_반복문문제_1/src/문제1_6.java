import java.util.Scanner;
public class 문제1_6 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("두개의 정수 입력(시작, 끝):");
		int s = Sc.nextInt();
		int e = Sc.nextInt();
		
		int mul = 1;
		for(int i=s;i<=e;i++)
			mul *= i;
		System.out.printf("%d~%d까지의 곱:%d",s,e,mul);
	}
}
