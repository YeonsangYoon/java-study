
public class 삼항연산자_1 {
	public static void main(String[] args) {
		int no = (int)(Math.random()*2);
		char c1 = (char)(Math.random()*26+65);
		char c2 = (char)(Math.random()*26+97);
		char res = (no==0 ? c1 : c2);
		
		System.out.println(res);
		System.out.println(res>='A' && res<='Z' ? res + "는 대문자입니다." : res + "는 소문자입니다.");
	}
}
