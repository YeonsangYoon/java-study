/*
 *  1) 변수의 종류
 *     --------
 *     클래스 영역에 선언하는 변수 (맴버변수) ==== heap
 *       = 인스턴스 변수 : new를 사용할 때 저장되는 변수 (new설정에 따라 따로 저장)
 *         = 클래스객체명, 변수면
 *         Card c1 = new Card()
 *         c1.number = 10
 *       = 
 */
class Student {
	String name;
	int kor;
	int eng;
	int math;
}
public class 사용자정의_데이터형1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.kor = 90;
		s1.eng = 80;
		s1.math = 78;
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.name = "심청이";
		s2.kor = 80;
		s2.eng = 70;
		s2.math = 68;
		System.out.println(s2);
		
		Student s3 = new Student();
		s3.name = "강감찬";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 78;
		System.out.println(s3);
		
		System.out.println(s1.name + " " + s1.kor + " " + s1.eng + " " + s1.math);
	}
}
