class Employee{
	// 인스턴스 변수 (클래스가 메모리에 저장)
	int id;
	String name;
	String dept; // 부서
	String job; // 직위
	String loc; // 근무지
	long pay; // 연봉
	// 스태틱 변수 : 메모리 공간이 1개만 설정 => 컴파일러에 의해 자동 생성
	// new 없이 사용이 가능
	static String company;
}
public class 사용자정의_데이터형5 {
	public static void main(String[] args) {
		Employee hong = new Employee();
		hong.id = 1;
		hong.name = "홍길동";
		hong.dept = "개발부";
		hong.job = "대리";
		hong.loc = "서울";
		hong.pay = 4500;
		hong.company = "SIST";
		Employee shim = new Employee();
		shim.id = 2;
		shim.name = "심청이";
		shim.dept = "개발부";
		shim.job = "사원";
		shim.loc = "서울";
		shim.pay = 3300;
		shim.company = "ABC";
		Employee park = new Employee();
		park.id = 3;
		park.name = "박문수";
		park.dept = "개발부";
		park.job = "과장";
		park.loc = "서울";
		park.pay = 6200;
		park.company = "ABC";
		
		hong.company = "BCD";
		shim.company = "CDE";
		park.company = "DEF";
		System.out.println("회사명:"+hong.company);
		System.out.println("회사명:"+shim.company);
		System.out.println("회사명:"+park.company);
		
	}
}
