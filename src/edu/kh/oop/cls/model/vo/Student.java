package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
//[접근제한자] [예약어] class 클래스명    

// 접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든 import 가능

	
	
	// 필드(field): 객체의 속성을 작성하는 클래스 내부 영역
	// 필드는 멤버 변수를 작성 하는 곳
	// 멤버 변수: 메서드 밖에 작성된 변수
	//			1) 인스턴스 변수 : 필드에 작성되는 일반 변수(객체 미생성 시 사용불가)(Heap영역)
	//			2) 클래스 변수(==static 변수) : 필드에 static 예약어가 작성된 변수
	//										객체 생성 안해도 사용 가능
	//										필드에 static 예약어가 작성된 변수
	
	
	// 필드 구성
	
	/*  한 줄씩 보지말고 각각 외우기
	 *  [접근제한자]  [예약어]           자료형     변수명 [=초기값]; // 대괄호는 생략 가능
	 * + public     final		   기본 자료형
	 * # protected  static		     배열
	 * ~ (default)  final static    클래스명
	 * - private    static final     참조형
	 */
	
	// => 필드의 접근제한자는 : 직접 접근 가능한 범위를 나타냄.
	
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	// 특별한 경우가 아니라면 private을 사용하자.
	private int v4 = 40;
	
	public void ex() {
		
		System.out.println("같은 클래스 내부 직접 접근해보자");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
	
	// static 예약어
	
	public static String schoolName = "KH 정보교육원";
			//static 필드 확인 예제
	private String name; // 캡슐화 원칙을 사용하여 private을 사용 -> 간접 접근 방법이 필요
	
	{
		//초기화 블록 : 객체 생성 시 필드 값 초기화
		name = "홍길동";
		
	}
	
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name/* 자료형 변수명(아무거나 써도 됨) 매개변수*/) {
		this.name = name;
	}
	
	
	
	// 생성자
	// 메소드
	
}
