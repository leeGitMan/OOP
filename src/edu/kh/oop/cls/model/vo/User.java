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
		
		// - this의 이유 - 매개 변수로 전달 받은 값을 필드에 초기화(this 참조변수)
		
		// *** this 참조 변수 ***
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// - 모든 객체 내부에 숨겨져있다.
		// ?? 왜 사용 ??
		// -> 필드명과 매개변수명이 같을 경우
		// 이를 구분하기 위해서 주로 사용.
		
	}
	
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자
	
	public User(String userId, String userP, String userName, int userAge, char userGender) {
		
		
		
		
		// User(userId, userP) // User 는 본인을 3인칭으로 부르는 거 싫어함
		
		this(userId, userP); // this() 생성자 - 같은 클래스의 다른 생성자를 호출할 때 사용
		// - 생성자내에 반드시 첫 줄에 작성되어야 한다. 아무도 얘 위에 있으면 안됨
		// 오버로딩 때만 사용
		// 코드길이 감소, 재사용성 증가 but 가독성은 안좋아서 잘 사용 안함
		//this.userId = userId;
		//this.userP = userP;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
	}
	
	// ** 자바 **
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용 하지 않음.


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
