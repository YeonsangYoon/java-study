//문자 10개를 저장할 수 있는 배열을 선언하고 
// 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램
import java.util.Scanner;
public class 문제09 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		char[] c = new char[10];
		System.out.print("10개의 문자 입력:");
		for(int i=0;i<10;i++) {
			c[i]=Sc.next().charAt(0);
		}
		
		for(char i: c)
			System.out.print(i);
	}
}
