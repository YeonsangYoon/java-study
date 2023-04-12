// 데이터 / 기능
// 명사형 / 동사형
/*
 *   번호 작성자 내용 제목 작성일 비밀번호 조회수 => 명사형 (변수)
 *   글쓰기 수정하기 내용보기 삭제하기 조회수올리기 => 동사형
 *   
 *   학생 => 유형
 *   게시판 => 무형
 *   ------------- 모든것 단순화 => 객체 지향 프로그램
 *   
 *   클래스
 *     = 변수 여러개 저장하는 공간 => 사용자정의 데이터형 (데이터형 클래스)
 *      ~VO(Spring) : Value Object
 *      ~DTO(MyBatis) : Data Transfor Object
 *      ~Bean(JSP)
 *     
 *     = 기능만 설정하는 클래스 : ~DAO, ~Service, ~Manager
 *         데이터베이스 연결, 브라우저 전송... , Jsoup(액션 클래스)
 *     = 변수 + 메소드 혼합 => 극히 드물다
 */
class Board{
	int no;
	int hit;
	String name;
	String subject;
	String content;
	String pwd;
	String regDate;
}
public class 사용자정의_데이터형2 {
	public static void main(String[] args) {
		// 첫번째 게시물
		Board b1 = new Board();
		System.out.println("b1 = "+b1);
		b1.no=1;
		b1.name="홍길동";
		b1.subject = "메모리 공간 만들기(사용자 정의)";
		b1.content = "class를 이용해서 데이터를 모아서 관리";
		b1.regDate = "2023-04-12";
		b1.pwd = "1234";
		System.out.println("게시물 번호 : " + b1.no);
		System.out.println("작성자 : " + b1.name);
		System.out.println("제목 : " + b1.subject);
		System.out.println("내용 : " + b1.content);
		System.out.println("작성일 : " + b1.regDate);
		System.out.println("조회수 : " + b1.hit);
	}
}
