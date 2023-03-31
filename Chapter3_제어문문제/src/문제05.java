//문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
//      프로그램 작성
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class 문제05 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = Sc.nextInt();
		
		if(num > 0)
			System.out.println(num + "은(는) 양수입니다.");
		if(num < 0)
			System.out.println(num + "은(는) 음수입니다.");
		if(num == 0)
			System.out.println(num + "은(는) 0입니다.");
		
	}
}
