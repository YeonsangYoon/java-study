import java.util.Scanner;
public class 문제03 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = Sc.nextInt();
		
		if(num < 0)
			num = -num;
		
		System.out.println("a="+num);
	}
}
