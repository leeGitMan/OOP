package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {
	// 클래스 접근 제한자 확인해보기
	public void ex1() {
		Student std = new Student();
		// public class인 Student는 import 가능
		
		//TestVo test = new TestVo();
		//default class인 TestVo는 import 불가하다. because 다른 패키지라서
		
		System.out.println(std.v1); // 왜 protected는 안되는가? 야이 멍청아 같은 패키지가 아니니깐 안되지
		// 다른 패키지에서도 접근 가능한 public만 에러가 없다.
		
		
	}
	
	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		// public 이기 때문에 직접 접근 가능
		
		System.out.println(std2.schoolName);
		// public 이기 때문에 직접 접근 가능
		
		System.out.println("변경 전: " + std1.getName());
		std1.setName("이현경");
		System.out.println("변경 후: " + std1.getName());
		
		System.out.println("변경 전 : " + std1.schoolName);
		std1.schoolName = "KH 고등학교"; // private이 아니기 때문에 변경됨
		System.out.println("변경 후: " + std1.schoolName);
		
		
		// schoolName에 노란줄이 뜨는 이유! -> 제대로 작성 안해서
		
		// *** static이 붙은 필드(변수)는
		// 클래스명.변수명 으로 사용함
		
		Student.schoolName = "KH";
		System.out.println("Student.schoolName: " + Student.schoolName);
		
		/*static
		 * 
		 * 
		 *  1) 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함
		 *  
		 *  => 프로그램 시작 시 static이 붙은 코드들이
		 *  모두 static 영역에 생성되고,
		 *  프로그램이 종료될 떄 까지 사라지지 않음.(정적)
		 *  그리고 static 영역에 생성된 변수는 어디서든 공유 가능
		 *  그래서 공유 메모리 영역이라고도 함.
		 *  
		 *  2) 사용법 : 클래스명.변수명
		 */
		
		
	}
	
	public void ex3() {
		// 생성자 확인 테스트 
		Student s1 = new Student();
					// 기본 생성자
		
		
		
		// User 기본 생성자를 이용해서 객체 생성
		
		
		
		
		// User 객체 필드 초기화 확인
		
		// System.out.println(u1.);
		// 클래스에서 메서드에 getter setter 미작성 시 간접 접근 불가능
		User u1 = new User();
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserP());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		
		
		
		System.out.println("=========================");
		
		
		// 현재 문제점 : u1이 참조하고 있는 User객체와
		//			  u2가 참조하고 있는 User 객체가 필드의 값이 모두 동일
		//			  같은 기본 생성자로 User객체를 생성해서임
		
		// 해결 방법 1: setter를 이용한 새로운 값을 대입
		
		
		
		User u2 = new User();
		
		u2.setUserId("asdasd");
		u2.setUserP("123123");
		u2.setUserGender('F');
		u2.setUserName("영희");
		
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserP());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		User u3 = new User("test01" , "pass2");
		System.out.println("=========================");
		
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserP());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		User u4 = new User("asdasd" , "pass3");
		System.out.println("=========================");
		
		System.out.println(u4.getUserName());
		System.out.println(u4.getUserId());
		System.out.println(u4.getUserP());
		System.out.println(u4.getUserAge());
		System.out.println(u4.getUserGender());
		
		
		
		// 매개변수 순서 대로 넣기
		
		// 매개 변수 생성자를 이용해서 바꿔보기
		// 기본 생성자 쪽에서 만들기
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
