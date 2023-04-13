/*
 *    1. 구성요소
 *    2. 구성요소 사용법
 *    3. 접근범위
 *    4. 객체지향의 3대 요소
 *    5. 클래스의 종류
 *    6. 예외처리
 *    --------------------
 *    API => 지정된 라이브러리 사용법
 */
class Student{
	int id;
	String name;
}
public class 클래스의구성요소_1 {
	public static void main(String[] args) {
		Student hong = new Student();
		hong.id = 1;
		hong.name = "hong";
		
		Student shim = hong;
		shim.id = 2;
		shim.name = "심청이";
		System.out.println(hong.id);
		System.out.println(hong.name);
	}
}
