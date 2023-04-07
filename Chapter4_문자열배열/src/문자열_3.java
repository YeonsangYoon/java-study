import java.util.Scanner;

/*
 *   같은 문자열인지 확인
 *   => 기본형 (==, !=)
 *   => 문자열 비교 (equals(), !equals())
 *   => log in => id, password
 */
public class 문자열_3 {
	public static void main(String[] args) {
		final String ID = "hong";
		final String PWD = "H1234";
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id = Sc.next();
		System.out.print("비밀번호 입력:");
		String pwd = Sc.next();
		
		// String => 문자열 저장이 아니고 메모리 주소
		// equals => 메모리에 저장된 실제 문자열 비교, 대소문자를 구분
		// 대소문자를 구분하지 않는 기능(equalsIgnoreCase()) ==> 검색기능에서 사용
		if(id.equalsIgnoreCase(ID) && pwd.equalsIgnoreCase(PWD)) {
			System.out.println(id+"님 로그인되었습니다");
		}
		else {
			System.out.println("아이디나 비밀번호가 틀립니다");
		}
	}
}
