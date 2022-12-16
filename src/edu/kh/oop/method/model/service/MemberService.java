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
	
	
	// 메뉴 화면 출력 기능 메소드
	
	public void displayMenu() {
		// 일은 하는데, 결과 값이 없다.
		int menuNum = 0; // 지역 변수
		
		
		do { // 한 번 무조건 반복
			System.out.println("======회원 정보 관리 프로그램======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			
			System.out.print("메뉴 입력 >>>>>");
			
			menuNum = sc.nextInt(); // 필드에 작성 된 Scanner sc를 사용
			sc.nextLine(); // 입력 버퍼에 남은 개행 문자 제거
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : break;
			case 4 : break;
			case 0 : break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력바랍니다.");
			}
		}while(menuNum != 0); // 메뉴넘이 0이 아닐 때 까지 반복, 
							  // 메뉴 0이면 반복 종료
	}
	
	
	// 회원 가입 기능 있는 메소드
	public String signUp() {
		//(반환형 스트링이 있기에 리턴없다고 에러남)
		System.out.println("**** 회원 가입 ****");
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next(); // user 01
		
		System.out.print("패스워드 입력 : ");
		String memberPw = sc.next();
		
		System.out.print("패스워드 확인 입력 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("나이 입력 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원 가입
		// 일치하지 않으면 회원 가입 실패 구문 입력
		
		if(memberPw.equals(memberPw2)) { // 일치하는 경우
			
		memberInfo = new Member(memberId, memberPw, memberName, memberAge); 
		return "회원 가입 성공!";
		
		}else {
			return "회원 가입 실패! (비밀번호 불일치)";	
		}
	}
	
	
	// 로그인 기능이 있는 메소드
	
	public String login() {
		
		System.out.println("***** 로그인 ****");
		
		// 회원 가입을 했는지 부터 확인하는 작업을 해야함.
		// == memberInfo 객체를 참조하는 지 확인
		
		if(memberInfo == null) { //회원 가입 안한 경우
			
			return "회원 가입부터 진행해주세요.";
			
		}
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀 번호 입력 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) && 
				memberPw.equals(memberInfo.getMemberPw())){
			
			loginMember = memberInfo;
			
			return loginMember.getMemberName() + "님 환영합니다.";
		}else {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		}
	}
	// 회원 정보 조회 가능 메소드
	// 회원 정보 수정(update) 메소드
}
