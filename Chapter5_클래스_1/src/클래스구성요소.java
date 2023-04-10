/*
 *     자바 형식
 *     -------
 *       package 클래스의 위치 ==> 한번 사용
 *       import 외부 라이브러리 불러오기 ==> 여러번 사용이 가능
 *       public class ClassName
 *       {
 *          -----------------------------
 *           맴버변수
 *             = 인스턴스 변수 => new를 사용할때마다 메모리가 따로 생성
 *             = 정적변수 (공유변수) => 메모리가 한개만 생성
 *          -----------------------------
 *           생성자 : 메모리 할당시 호출되는 메소드
 *                   = 맴버변수에 대한 초기화
 *          -----------------------------
 *           메소드 : 특정 작업을 수행하는 명령문의 집합
 *          -----------------------------
 *           main() : 프로그램의 시작점
 *          -----------------------------
 *       }
 *       ===> OOP답게 변환 (객체지향프로그램)
 *            1) 데이터 보호 (캡슐화)
 *            2) 재사용 (상속/포함)
 *            3) 수정, 추가 (다형성) => 오버라이딩/오버로딩
 *       ===> 클래스의 종류 (추상클래스 / 인터페이스)
 *       ===> 예외처리
 *       --------------------------------------------------- 자바언어 기초
 *       ===> 라이브러리 : 사용자 정의, 자바에서 지원, 외부 지원(ex. Jsoup)
 *       
 *       메소드 기초
 *       --------
 *       메소드 : 한개의 기능을 수행할 목적
 *              1. 메소드 제작 목적
 *                 ------------
 *                  = 재사용 (다른 클래스에서 사용하기 위해 만든다)
 *                  = 중복된 코드를 제거 : 아래의 '오라클 연결', '오라클 닫기'같은 반복되는 동작을 메소드로 정의
 *                    예) 
 *                       데이터베이스 연결
 *                       -------------- 목록
 *                         오라클 연결
 *                         목록에 출력할 데이터를 읽기
 *                         오라클 닫기
 *                       -------------- 데이터 추가
 *                         오라클 연결
 *                         데이터 추가
 *                         오라클 닫기
 *                       -------------- 데이터 수정
 *                         오라클 연결
 *                         데이터 수정
 *                         오라클 닫기
 *                       -------------- 데이터 삭제
 *                         오라클 연결
 *                         데이터 삭제
 *                         오라클 닫기
 *                  = 구조화된 프로그램 : 단락을 나눠서 처리 (에러...)
 *                  
 *              2. 메소드 형식
 *                 public static void main(String[] args) : 선언부
 *                 { : 구현부
 *                 }
 *              3. 메소드 구성요소
 *                 결과값 메소드명(매개변수...)
 *                 ----- 1개    --------- 여러개 사용이 가능
 *                 
 *                 => 사용자의 요청값을 받아서 처리 결과값을 넘겨준다
 *                    ----------- 매개변수     ------ 리턴형
 *                    예) 로그인
 *                       사용자 요청값 : id, pwd
 *                       결과값 : 로그인 여부(성공 or 실패)
 *                       boolean isLogIn(String id, String pwd)
 *                    
 *                    예) 더하기
 *                       사용자 요청값 : 정수 2개
 *                       결과값 : 정수 2개를 더한값
 *                 =>
 *                 리턴형     매개변수
 *                 ------------------------
 *                   O         O
 *                  리턴형   메소드명(매개변수)
 *                  String  substring(int s, int e)
 *                 ------------------------
 *                   O         X
 *                  리턴형   메소드명()
 *                  String  trim()
 *                  double  random()
 *                 ------------------------
 *                   X         O
 *                  void    메소드명(매개변수)
 *                  void   main(String[] args)
 *                 ------------------------
 *                   X         X
 *                  void    메소드명()
 *                  void   println()
 *                 ------------------------
 *                 *** 결과값(처리) => 리턴형
 *                 리턴형 : 기본형, 배열, 클래스
 *                 메소드명
 *                   = 알파벳이나 한글 사용 가능(알파벳은 대소문자 구분)
 *                   = 숫자 사용이 가능(앞에 사용 불가)
 *                   = 특수문자 사용 가능(_ , $)
 *                   = 키워드 사용 불가
 *                   = 공백이 있으면 안된다
 *                   = 약속사항 => camelCase
 *                 매개변수 : 사용자가 요청한 값 => 3개 이상
 *                          게시판 글쓰기, 수정, 회원 가입 등
 *                          *** 3개이상이면 => 배열, 클래스 이용 
 *              
 *              형식)
 *                int add(int a, int b) // 선언부	
 *                {
 *                    // 구현부
 *                    int c = a+b;
 *                    return c; // 선언부에서 정의한 return 형식과 동일해야한다
 *                }
 *                
 *                void gugudan()
 *                {
 *                    // 구구단을 출력
 *                    ...
 *                    return; ==> 메소드는 종료시점이 return에서 종료
 *                    => void일때는 생략 가능 => 컴파일러가 자동으로 return을 추가한다
 *                }
 *                
 *                ** 변수(20%) / 메소드(80%)
 *           *** 메소드 사용하는 방법
 *               = 프로그램
 *               1. 재사용
 *               2. 가독성 : 보기 편하다 (유지보수) => 단락 나누기
 *               = 모든 프로그램 => 메소드 제작
 *                 1. 사용자 입력
 *                 2. 사용자 요청 처리 => 세분화
 *                 3. 결과값 출력
 */
// 1. 3개의 정수를 받아서 
// 2. 총점, 평균, 학점을 구해서 출력
import java.util.Scanner;
 public class 클래스구성요소 {
	/*
	 *    메소드
	 *      1) 인스턴스 메소드 => 객체 생성시마다 따로 저장
	 *      2) 정적 메소드 => 한개의 공간에만 저장 (JVM에 의해 메모리에 자동 저장)
	 *         static
	 *      3) 추상 메소드 : 선언만 하는 메소드 (추상클래스, 인터페이스)
	 *         abstract
	 *      4) 종단 메소드 : 상속이 안되는 메소드(수정이 불가능한 메소드)
	 *         final
	 */
	static int input(String subject) {
		Scanner Sc = new Scanner(System.in);
		System.out.print(subject + "입력:");
		int ret = Sc.nextInt();
		return ret;
	}
	static int getTotal(int kor, int eng, int math, int his, int phy) {
		return kor+eng+math+his+phy;
	}
	static double getAverage(int total, int cnt) {
		return (double)total/cnt;
	}
	static char getScore(double avg) {
		char score = 'A';
		switch((int)avg/10) {
		case 10:
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default:
			score = 'F';
			break;
		}
		return score;
	}
	public static void main(String[] args) {
//		Scanner Sc = new Scanner(System.in);
//		// 반복 제거
//		System.out.print("국어 입력:");
//		int kor = Sc.nextInt();
//		
//		System.out.print("영어 입력:");
//		int eng = Sc.nextInt();
//		
//		System.out.print("수학 입력:");
//		int math = Sc.nextInt();
//
//		System.out.print("국사 입력:");
//		int his = Sc.nextInt();
//		
//		System.out.print("물리 입력:");
//		int phy = Sc.nextInt();
		
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		int his = input("역사");
		int phy = input("물리");
		System.out.println("국어:"+kor);
		System.out.println("수학:"+eng);
		System.out.println("영어:"+math);
		System.out.println("역사:"+his);
		System.out.println("물리:"+phy);
		
		int total = getTotal(kor, eng, math, his, phy);
		System.out.println("총점:"+total);
		
		double avg = getAverage(total, 5);
		System.out.printf("평균:%.2f\n", avg);
		
		char score = getScore(avg);
		System.out.println("학점:"+score);
	}
}
