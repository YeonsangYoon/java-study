package com.sist.program;
import java.io.FileReader;
import java.io.IOException;
// VO => DAO => 전송 => 관련된 데이터는 무조건 묶어서 보낸다(VO)
import java.util.*;
public class SeoulSystem {
	private static SeoulLocationVO[] datas = new SeoulLocationVO[273];
	// 모든 사용자가 데이터를 공유함
	static {
		try(FileReader fr = new FileReader("C:\\javaDev\\seoul_location.txt")) {
			StringBuilder sb = new StringBuilder();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			String[] lines = sb.toString().split("\n");
			
			i=0;
			for(String s : lines) {
				StringTokenizer st = new StringTokenizer(s, "|");
				datas[i] = new SeoulLocationVO();
				datas[i].setNo(Integer.parseInt(st.nextToken()));
				datas[i].setName(st.nextToken());
				datas[i].setContent(st.nextToken());
				datas[i].setAddress(st.nextToken());
				i++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static private int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============= 메뉴 =============");
		System.out.println("1. 목록 출력(페이지별)");
		System.out.println("2. 상세 보기");
		System.out.println("3. 명소 검색");
		System.out.println("4. 주소 검색");
		System.out.println("9. 종료");
		System.out.println("===============================");
		System.out.print("메뉴 선택:");
		return sc.nextInt();
	}
	static public SeoulLocationVO[] nameFind(String fd) {
		ArrayList<SeoulLocationVO> list = new ArrayList<SeoulLocationVO>();
		for(SeoulLocationVO vo : datas) {
			if(vo.getName().contains(fd))
				list.add(vo);
		}
		SeoulLocationVO[] ret = new SeoulLocationVO[list.size()];
		ret = list.toArray(ret);
		return ret;
	}
	static public SeoulLocationVO[] addressFind(String fd) {
		ArrayList<SeoulLocationVO> list = new ArrayList<SeoulLocationVO>();
		for(SeoulLocationVO vo : datas) {
			if(vo.getAddress().contains(fd))
				list.add(vo);
		}
		SeoulLocationVO[] ret = new SeoulLocationVO[list.size()];
		ret = list.toArray(ret);
		return ret;
	}
	static public void process() {
		System.out.println("★★★★★★★★★ SIST 영화 ★★★★★★★★★");
		Scanner sc = new Scanner(System.in);
		while(true) {
			int menu = menu();
			
			if(menu == 1) {
				int page;
				while(true) {
					System.out.print("페이지 입력:");
					page = sc.nextInt();
					if(page < 0 || page > 28)
						System.out.println("없는 페이지 입니다!");
					else
						break;
				}
				System.out.println(page+" page / 28 page");
				SeoulLocationVO[] result = Arrays.copyOfRange(datas, (page-1)*10, Math.min(page*10, datas.length));
				for(SeoulLocationVO vo : result) {
					System.out.println(vo.getNo() + "." + vo.getName());
				}
			}
			else if(menu == 2) {
				System.out.print("상세");
			}
			else if(menu == 3) {
				System.out.print("검색어 입력:");
				String s = sc.next();
				SeoulLocationVO[] result = nameFind(s);
				System.out.printf("%s 검색 결과 : 총 %d건 입니다\n", s, result.length);
				for(SeoulLocationVO vo : result) {
					System.out.println(vo.getNo() + "." + vo.getName());
				}
			}
			else if(menu == 4) {
				System.out.print("주소 입력:");
				String s = sc.next();
				SeoulLocationVO[] result = addressFind(s);
				System.out.printf("%s 검색 결과 : 총 %d건 입니다\n", s, result.length);
				for(SeoulLocationVO vo : result) {
					System.out.println(vo.getNo() + "." + vo.getName() + " : " + vo.getAddress());
				}
			}
			else if(menu == 9) {
				System.out.println("프로그램 종료!!");
				return;
			}
		}
	}
}
