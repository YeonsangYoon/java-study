// ID/PWD를 받아서 로그인 처리
/*
 *   리턴형의 경우의 수
 *   두개 => boolean(성공/실패)
 *   세개 => int, String
 *          ID가 없는 경우 1
 *          ID는 존재 Password가 틀리는 경우 2
 *          ID, PWD가 틀리는 경우 3
 *          ----------------------------------
 *          1. 재사용
 *          2. 견고
 *          3. 가독성
 *          
 */
import java.util.Scanner;
public class 메소드_2 {
	static String isLogIn(String id, String pwd) {
		String[] ids = {"hong", "park", "shim", "lee", "kang"};
		String[] pwds = {"1234", "3456", "4567", "5678", "6789"};
		String[] names = {"홍길동", "박문수", "심청이", "이순신", "강감찬"};
		
		int index = 0;
		boolean check = false;
		for(int i=0;i<ids.length;i++) {
			if(id.equals(ids[i])) {
				index = i;
				check = true;
			}
		}
		
		if(!check)
			return "NOID";			
		else if(pwd.equals(pwds[index]))
			return names[index];
		else 
			return "NOPWD";
	}
	
	static void process() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("ID 입력:");
		String id = Sc.next();

		System.out.print("PWD 입력:");
		String pwd = Sc.next();
		
		String result = isLogIn(id, pwd);
		if(result.equals("NOID")) {
			System.out.println("아이디가 존재하지 않습니다!");
		} 
		else if(result.equals("NOPWD")) {
			System.out.println("비밀번호가 틀립니다!");
		} 
		else {
			System.out.println(result + "님 로그인되었습니다");			
		}
	}
	public static void main(String[] args) {
		process();
	}
}
