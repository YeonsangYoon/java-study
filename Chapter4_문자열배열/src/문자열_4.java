// length() => 문자개수 => 
// trim() ==> 좌우 공백 제거
import java.util.Scanner;
public class 문자열_4 {
	public static void main(String[] args) {
//		Scanner Sc = new Scanner(System.in);
//		System.out.print("문자열 입력:");
//		String s = Sc.next();
//		System.out.println("입력된 값:"+s);
//		System.out.println("문자 개수:"+s.length());
		
		String s = "Hello Java!!  ";
		System.out.println(s.length());
		System.out.println(s.trim().length()); // 좌우의 공백만 제거
	}
}
