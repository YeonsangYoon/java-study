import java.util.Scanner;
public class 문제15 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = Sc.nextInt();
		
		if(num >= 10 && num < 100) {
			if(num%11==0)
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		else {
			System.out.println("10~99사이의 수를 입력해주세요!");
		}
	}
}
