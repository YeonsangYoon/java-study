package com.sist.exam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

// MemberVO, MemberDTO => 사용자 정의 데이터형 (읽기/쓰기)
public class Member {
	private String id;
	private String name;
	private String gender;
}
