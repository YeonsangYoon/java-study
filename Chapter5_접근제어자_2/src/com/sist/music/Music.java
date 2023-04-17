package com.sist.music;
/*
 *    1. 재사용
 *       = 상속 : 기존의 클래스를 확장해서 사용 => extends
 *               (자바는 단일 상속만 가능하다)
 *               
 *               *** 모든 클래스는 Object 클래스의 상속을 받고 있다
 *                   Object => 모든 클래스의 최상위 클래스
 *               *** 상속의 예외 조건
 *                   생성자, static, private, 초기화 블록
 *       = 포함
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
}
