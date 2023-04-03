import java.util.Scanner;
public class 문제04 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = Sc.nextInt();
		
		if(num%400==0 || (num%4==0 && num%100!=0))
			System.out.println(num + "년도는 윤년입니다");
		else
			System.out.println(num + "년도는 윤년이 아닙니다");
			
	}
}
