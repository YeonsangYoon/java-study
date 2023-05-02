package com.sist.io;
/*
 *    FileInputStream : 단위 byte(1byte씩 읽어 온다)
 *      => 한글포함된 데이터는 깨질 수 있다
 *         ------------- FileReader
 *      => .zip .ppt .png => 업로드/다운로드
 *      => Web에서 자료실, 갤러리 게시판 만들때 사용할 수 있음
 *      => 주요 메소드 
 *          read() : 1byte, 리턴형(int)
 *          close() : 닫기
 *      => 생성자
 *          new FileInputStream(File file)
 *          new FileInputStream(String path)
 */
import java.io.*;
public class FileInputStream_1 {
	public static void main(String[] args) {
		try {
			// 파일 읽기
//			FileInputStream f = new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\InputOutputMain.java");
			FileReader f = new FileReader("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\InputOutputMain.java");
			int i=0; 
			// 1byte를 읽어와 i에 저장
			// -1 : EOF(End of File)
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
			f.close();
		}catch (Exception e) {}
	}
}
