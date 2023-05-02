package com.sist.io2;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter

// file => 비휘발 저장 장치
// file 단점 : 보안 (다른 사람도 접근 가능), 독립적(여러개의 파일을 연결할 수 없다)
// 임시 저장용으로 사용
public class Student {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	@Override
	public String toString() {
		return id+" "+name+" "+kor+" "+eng+" "+math+" "+total+" "+String.format("%.2f", avg);
	}
}
