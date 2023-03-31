// 중첩 ==> if~else
// 사칙연산 +, -, *, /
import java.util.Scanner;

public class 선택조건문_3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("두개의 정수 입력:");
		int num1 = Sc.nextInt();
		int num2 = Sc.nextInt();
		System.out.print("연산자 입력: ");
		char op = Sc.next().charAt(0);
		
		if(op == '+' || op == '-' || op == '*' || op == '/') {
			int result = 0;
			if(op == '+')
				result = num1+num2;
			if(op == '-')
				result = num1-num2;
			if(op == '*')
				result = num1*num2;
			if(op == '/')
				result = num1/num2;
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}
		else {
			System.out.println("잘못된 연산자입니다!!");
		}
	}
}
