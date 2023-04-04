import java.util.Scanner;
public class 반복제어문_2 {
	public static void main(String[] args) {
		// 세자리 정수 입력
		// 조건 : 0을 포함 할 수 없다
		// 조건 : 같은 수를 입력할 수 없다
		Scanner Sc = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수를 입력:");
			int num = Sc.nextInt();
			if(num < 100 || num >= 1000) {
				System.out.println("잘못된 입력입니다");
				continue;
			}

			int n1 = num / 100;
			int n2 = (num % 100) / 10;
			int n3 = num % 10;
			
			if(n1 == 0 || n2 == 0 || n3 == 0) {
				System.out.println("0을 사용할 수 없습니다");
				continue;
			}
			else if(n1 == n2 || n1 == n3) {
				System.out.println("같은 숫자는 사용할 수 없습니다");
				continue;
			}
			
			System.out.println("입력값: " + num);
			break;
		}
		// for => 제외
		// while => 처음부터 다시 수행
	}
}
