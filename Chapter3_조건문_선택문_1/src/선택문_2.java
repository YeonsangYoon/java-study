import java.util.Scanner;

public class 선택문_2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("세개의 정수 입력:");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		int total = a+b+c;
		int avg = total/3;
		
		char score = 'A';
		
		switch(avg/10) {
		case 10: case 9: // 100 ~ 90 => (avg/10)==10 || (avg/10)==9
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default:
			score = 'F';
			break;
		}
		System.out.println("학점: "+score);
	}
}
