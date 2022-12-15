package edu.kh.oop.cls.model.vo;

public class User {
	// 필드
	// == 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별 --> 추상화
	private String userId;
	private String userP;
	private String userName;
	private int userAge;
	private char userGender;
	
	
		
	// 생성자
	// 기본 생성자
	
	public User() {
		
		//기능
		System.out.println("기본 생성자로 User 객체 생성");
		
		
		
		// 필드 초기화 
		userId = "user01";
		userP = "pass01";
		userName = "이현경";
		userAge = 20;
		userGender = 'M';		
		
		// 프린트 구문을 출력하고
		// 밑에 초기화함.
		
	}
	
	// 매개변수 생성자
	// ** 사용되는 기술, 변수 : 매개변수, Overloading(오버로딩), this
	
	
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	//				전달 되어 지는 값을 저장하는 변수
	//			-> 전달 받은 값을 저장하고 있는 매개체(지니고 있는) 역할의 변수
	
	public User(String userId, String userP) {
		
		this.userId = userId;
		this.userP = userP;
		
		
	}
	
	
	
	


	// 메서드
	// 캡슐화로 인한 간접 접근 기능(getter / setter)

	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserP() {
		return userP;
	}



	public void setUserP(String userP) {
		this.userP = userP;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserAge() {
		return userAge;
	}



	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}



	public char getUserGender() {
		return userGender;
	}



	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	

	
	// getter/setter 자동 완성
	// alt + shift + s
	
	

}
