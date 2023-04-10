// 계산기 제작
import java.util.Scanner;
public class 메소드_2 {
	static int plus(int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static int mul(int a, int b) {
		return a * b;
	}
	static String div(int a, int b) {
		String ret = "";
		if(b==0)
			ret = "0으로 나눌 수 없습니다";
		else
			ret = a+"/"+b+"="+(double)(a/b);
		return ret;
	}
	static void process() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a = Sc.nextInt();

		System.out.print("두번째 정수 입력:");
		int b = Sc.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /):");
		String op = Sc.next();
		
		switch(op) {
		case "+":
			System.out.printf("%d+%d=%d", a, b, plus(a, b));
			break;
		case "-":
			System.out.printf("%d-%d=%d", a, b, minus(a, b));
			break;
		case "*":
			System.out.printf("%d*%d=%d", a, b, mul(a, b));
			break;
		case "/":
			System.out.println(div(a, b));
			
		}
	}
	public static void main(String[] args) {
		process();
	}
}
