package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // 클래스
	
	//속성(필드)
	//필드는 기본적으로 캡슐화 원칙에 의해 private이라는 접근제한자를 작성한다.
	//필드에 변수를 하나 작성하면, 클래스 안 어다에서든 사용 가능
	//기능
	
	private Scanner sc = new Scanner(System.in);
									//System.in : 자바에서 기본적으로 
									//지정 해온 입력 장치 (키보드)
	
	private Member memberInfo = null; // 가입할 회원의 정보를 저장할 변수
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
	// 기능(생성자, 메서드)
	// ** 여러 기능을 하나의 메소드에 모두 작성하지 말 것!
	// 하나의 기능만 수행하도록 작성
	// 메소드는 메소드당 딱 하나의 기능만 가지고 있는게 좋다.
	
	// 왜??
	// 기능별로 세분화를 해놔야지 필요한 기능만 뽑아서 쓰기 떄문에.
	
	
	/*
	public void today() {
		// 1. 밥 먹는 거
		// 2. 일 하는 거
		// 두개 다 쓰면 이 메서드를 호출할 때 두가지 기능을 하게 됨.
	}
	
	public void eat() {}
	
	public void work() {}
	
	// 두가지를 나눠서 메소드를 만들고,
	// eat(); work(); 하나씩 불러서 쓸 수 있게 된다.
	*/
	
	public MemberService() {
		
	}
	
	
	//public MemberService(int a) {} 궁금하면 주석 풀어서 확인해봐
	// 기본 생성자 작성하지 않고 매개변수 생성자 작성 시, Run에서 에러남
	
	// ** 메서드 작성법 **
	
	// [접제자]       [예약어]                       반한형     메소드명([매개변수]){ }
	// public		static					   기본 자료형
	// protected	final					  참조형(배열, 클래스)
	// (default)	abstract(추상 클래스 만들 떄)	 void
	// private		static final
	
	
	// ** 반환형 void **
	// - 반환(return)이란? 메소드 수행 후 호출부로 돌아가는 것
	// - 반환 값 : 메서드가 돌아가면서 가져 갈 결과 값
    // - 반환 형 : 반환 값의 자료형
	// -> void(텅빈, 무효의) : 돌려보낼 값(반환 값)이 없다는 뜻.
	
	
	
	
	
	
	
}
