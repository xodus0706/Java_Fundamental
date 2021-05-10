package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	
	//디폴트 생성자
	//생성자 => [접근한정자] [클래스 이름](){}
	//생성자는 반환값이 없음(void)
	//셍성자 역할은 인스터스 변수 초기화
	//생성자는 overloading이 가능하다(이름이 같으면서 매개변수가 서로 다른 것)
	//생성자의 접근한정자는 인스턴스(new)의 유무를 결정한다.
	public Admin() {
		//super();
	}
	
	
	//this의 용범
	//1. 자기자신 객체 => this or this. => 위치는 메서드, 생성자 모두 사용
	//2. 다른 생성자르 호출 => this(~매개변수) => 위치는 생성자에서만 사용가능
	public Admin (String id, String pwd, String email) {	
		this(id,pwd,email,0);
	}
	
	public Admin (String id, String pwd, String email, int level) {
		//super();
		//자기자신
		this.id = id;
		this.email = email;
		this.pwd= pwd;
		this.level = level;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd (String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public int getLevel( ) {
		return level;
	}

}
