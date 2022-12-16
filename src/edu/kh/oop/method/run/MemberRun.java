package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

//	[접제자] [예약어] 반환형 메소드명 ([매개변수])
	public static void main(String[] args) {
	
		MemberService ms = new MemberService();
								// 기본 생성자
		// MemberService의 기본 생성자가 작성 되어있지는 않음
		// 문제 없이 사용 가능 ! (컴파일러가 자동으로 생성)
		
		
		// !!! 주의할 점 !!!
		// 생성자가 하나라도 있으면, 기본 생성자 자동 생성을 안해줌.
		
		
	}

}
