import java.util.Scanner;

public class 문제13 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = Sc.nextInt();
		System.out.print("b 입력 : ");
		int b = Sc.nextInt();
		System.out.print("c 입력 : ");
		int c = Sc.nextInt();
		
		System.out.println("a * b + c = " + (a*b+c));
	}
}
