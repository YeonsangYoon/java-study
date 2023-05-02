package com.sist.io;
/*
 *    IO : Input(읽기) / Output(쓰기)
 *    
 *    1) 자바에서 IO는 Stream(데이터 이동통로)을 사용하고 있다 (Queue)
 *      => 메모리 입출력
 *      => 파일 입출력
 *      => 네트워크 입출력
 *    
 *    2) IO의 특징 : 단방향 통신
 *    
 *    3) 읽기/쓰기 데이터 크기 : 1byte/2byte
 *      => 1byte : ~InputStream, ~OutputStream
 *                 한글자당 1byte 읽기/쓰기 => 한글은 깨짐
 *                 업로드, 다운로드
 *      => 2byte : ~Reader, ~Writer
 *      
 *     -----------------                                 ---------
 *      메모리 (데이터저장) ========= 자바응용프로그램 ========== 화면 출력
 *     -----------------    |                       |    ---------
 *                          |                       |
 *                     InputStream             OutputStream
 *     
 *     Stream : 데이터가 이동하는 통로(단방향)
 *       읽기 : 데이터가 저장된 위치로부터 데이터를 읽어 들이기 위한 연결
 *             InputStream(바이트스트림:1byte씩) / Reader(문자 스트림:2byte씩)
 *             - 메모리에 있는 데이터
 *             - 파일에 있는 데이터
 *             - 소켓에 있는 데이터
 *       쓰기 : 프로그램에서 출력 위치로 프로그램에 전송하는 통로
 *             OutputStream(바이트스트림:1byte씩) / Writer(문자 스트림:2byte씩)
 *     
 *     IO관련 클래스 계층관계
 *                   Object
 *        ByteStream   |
 *             ---------------------------------------------
 *             |                                            |
 *       ------------------------                     -----------------
 *       |                      |                     |               |
 *   InputStream           OutputStream             Reader          Writer
 *       |                      |                     |               |
 *   FileInputStream       FileOutputStream      
 *   FilterInputStream     FilterOutputStream
 *       |
 *   BufferedInputStream    BufferedOutputStream
 *  -------------------------------------------
 *   ObjectInputStream     ObjectOutputStream
 *   
 *   모드(mode) => r, w, a
 *              read, write, append
 *   ----------------------------------------------------------------           
 *   File : 독립 클래스
 *   ==> 1) 파일
 *       2) 디렉토리(폴더)
 *       
 *       File 사용방법
 *        = 생성방법
 *          File f = new File("파일경로");
 *       File의 주요기능(메소드)
 *        = 파일 정보
 *          getName() : 파일명
 *          getPath() : 경로명/파일명
 *          getParent() : 경로명
 *        = 파일 특성
 *          canRead() : 읽기 전용
 *          canWrite() : 쓰기 전용
 *          isHidden() : 숨긴 파일
 *        = 파일 여부
 *          isFile()
 *          isDirectory()
 *          exists() 
 *        = 파일 조작
 *          createNewFile() : 파일만들기
 *          mkdir() : 디렉토리 만들기
 *          delete() : 파일 삭제(파일이 포함된 디렉토리는 불가)
 *        = 수정 날짜
 *          long lastModified()
 *        = 파일 크기
 *          long length()
 *        = 디렉토리에 있는 목록
 *          listFiles()
 *          
 *   FileInputStream     FileReader
 *   ---------------     -----------
 *     int read()        char read()
 *     write(byte)       write(String)
 */
// IO => CheckedException => 반드시 예외처리를 해야 사용이 가능
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
public class InputOutputMain {
	public static void main(String[] args) {
		// 파일 선언
		File f = new File("C:\\javaDev\\back.jpg");
		long size = f.length();
		if(size<1024)
			System.out.println("파일 크기:" + size + "Bytes");
		else
			System.out.println("파일 크기:" + size/1024 + "KB");
		
		System.out.println("읽기 전용:"+f.canRead());
		System.out.println("쓰기 전용:"+f.canWrite());
		System.out.println("숨긴 파일:"+f.isHidden());
		System.out.println("수정 날짜:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(f.lastModified())));
		System.out.println("파일명:"+f.getName());
		System.out.println("경로명:"+f.getPath());
	}
}
