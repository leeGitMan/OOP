package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService2 {
	
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null;
	private Member memberlogin = null;
	
	
	public MemberService2() {
		
	}
	
	public void displayMenu2() {
		
		int num = 0;
		
		do {
			System.out.println("원하는 목록을 선택하세요");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 업데이트");
			System.out.println("0. 종료");
			
			System.out.println("번호 입력하세요>>>");
			
			switch(num){
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : break;
			case 4 : break;
			case 0 : break;
			default : break;
			}
		}while(num != 0);
	}
	
	
	
	public String signUp() {
		
		System.out.print("=======회원 가입 진행합시다.=======");
		
		
		
		
		
		System.out.print("아이디 입력해주세요");
		String memberId = sc.next();
		
		System.out.print("비밀번호를 입력해주세요");
		String memberPw = sc.next();
		
		System.out.print("비밀번호를 재입력해주세요");
		String memberPw1 = sc.next();
		
		System.out.print("이름을 입력해주세요");
		String memberName = sc.next();
		
		System.out.print("나이를 입력해주세요");
		int memberAge = sc.nextInt();
		
		sc.nextLine();
		
		// 회원 정보 입력완료
		// 비번 재입력한 거 비교
		
		if(memberPw.equals(memberPw1)) {
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			return "회원 가입 성공!";
		}
		else {
			return "회원 가입 실패(비밀번호 불일치)";
		}
	}
	
	
	public String login() {
		
		System.out.print("=======로그인 진행합시다.=======");
		
		
		// 회원 가입 여부 확인하기
		
		if(memberInfo == null) {
			System.out.println("회원 가입부터 진행해주세요.");
		}
		
		System.out.print("아이디를 입력해주세요 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호를 입력해주세요 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) && memberPw.equals(memberInfo.getMemberPw())){
			return "로그인 성공!";
		}
		return "로그인 실패! 다시 입력해주세요.";
	}
}
	