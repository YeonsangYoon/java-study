/*
 *   맴버변수 (인스턴스변수)
 *   ------------------
 *   1. 기본형
 *   2. 배열
 *   3. 클래스
 */
class Category{
	int no;
	String poster;
	String title;
	String subject;
}
class FoodHouse{
	int no;  // 중복이 안된 숫자 => primary key => 상태변수
	int cno; // 챀조키 => foreign key 
	String[] poster = new String[5];
	String address;
	double score;
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime, etime;
	String hol;
	String menu;
	
}
public class 사용자정의_데이터형3 {

}
