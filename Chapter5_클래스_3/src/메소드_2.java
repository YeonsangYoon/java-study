// 매개변수 전송법
/*
 *   = Call By Value : 일반 기본형 데이터 (String)
 *   = Call By Reference : 주소값을 넘겨주는 방식(배열, 클래스)
 *   
 *   but! java에서는 Call By Value로만 동작한다
 *   배열이나 클래스를 인자로 전달하면 메소드 안에서 매개변수가 전달받은 인자의 복사본으로 초기화가 된다.
 *   
 */
class Class{
	int num;
	Class(int i){
		this.num = i;
	}
}
public class 메소드_2 {
	static void run(Class a, Class b) {
		a.num = 111;
		a =  b; // 실제로 메소드안의 매개변수만 바뀐거지 기존의 인자가 바뀐것은 아니다
		// Stack 내부에서 a와 d1은 같은 주소값을 가지지만 참조변수의 주소는 다르다
	}
	public static void main(String[] args) {
		Class d1 = new Class(1);
		Class d2 = new Class(2);

		
		System.out.println("========= 실행전 =========");
		System.out.println("d1 주소:" + d1);
		System.out.println("d1 값:" + d1.num);
		System.out.println("d2 주소:" + d2);
		System.out.println("d2 값:" + d2.num);
		
		run(d1, d2);
		
		System.out.println("========= 실행후 =========");
		System.out.println("d1 주소:" + d1);
		System.out.println("d1 값:" + d1.num);
		System.out.println("d2 주소:" + d2);
		System.out.println("d2 값:" + d2.num);
		
	}
}
