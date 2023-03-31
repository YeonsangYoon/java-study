//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

public class 문제06 {
	public static void main(String[] args) {
		int no = (int)(Math.random()*2);
		char ch;
		
		if(no == 0) {
			ch = (char)(Math.random()*26+65);
		}
		else {
			ch = (char)(Math.random()*26+97);
		}
		
		if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "은(는) 대문자입니다!");
		else
			System.out.println(ch + "은(는) 소문자입니다!");			
	}
}
