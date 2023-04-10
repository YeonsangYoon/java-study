//	정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
//	정수 입력 
//	이진법 처리
//	출력 
import java.util.Scanner;
public class 메소드문제1 {
	static int inputInteger() {
		Scanner Sc = new Scanner(System.in);
		while(true) {
			System.out.print("0~32767까지의 정수 입력:");
			int num = Sc.nextInt();
			if(num >= 0 && num <= 32767)
				return num;
			else
				System.out.println("다시 입력해주세요");
		}
	}
	
	static String DecimalToBinary(int num) {
		String ret = "";
		for(int i=15;i>=0;i--) {
			if((1<<i)<=num) {
				ret += "1";
				num -= (1<<i);
			}
			else {
				ret += "0";
			}
			if(i%4==0)
				ret += " ";
		}
		return ret;
	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		int num = inputInteger();
		String result = DecimalToBinary(num);
		print(result);
	}
}
