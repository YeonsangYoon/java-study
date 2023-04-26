package com.sist.program;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

// 서울 명소 => 데이터형 (읽기 / 쓰기)
// VO => JSP => Bean(핵심기능)
public class SeoulLocationVO {
	private int no;
	private String name;
	private String content;
	private String address;
}
