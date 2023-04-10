// char 한개를 보내서 => 대문자, 소문자 => boolean
import java.util.Scanner;
public class 메소드_3 {
	static String isAlpha(char c) {
		if(c >= 'A' && c <= 'Z')
			return "대문자";
		else if(c >= 'a' && c <= 'z')
			return "소문자";
		else
			return "알파벳이 아닙니다";
	}
	static void process() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("알파벳 입력:");
		char c = Sc.next().charAt(0);
		
		String result = isAlpha(c);
		if(result.equals("대문자")) 
			System.out.println(c + "는 대문자입니다");
		else if (result.equals("소문자"))
			System.out.println(c + "는 소문자입니다");
		else
			System.out.println(result);
	}
	public static void main(String[] args) {
		process();
	}
}
