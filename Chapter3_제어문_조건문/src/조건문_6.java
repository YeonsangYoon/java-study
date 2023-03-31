// 년도를 입력을 받아서 윤년인지 아닌지 확인
// 4년마다
// 100년마다 제외
// 400년마다
import java.util.Scanner;
public class 조건문_6 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = Sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println(year + "년도는 윤년입니다!");
		else
			System.out.println(year + "년도는 윤년이 아닙니다!");
		
	}

}
