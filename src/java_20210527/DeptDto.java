package java_20210527;

public class DeptDto {
	//칼럼의 정보에 테이블 정보를 포함하고 중복되는 것을 원치 않는다.
	private int no;
	private String name;
	private String loc;
	//alt + shift + s -> c
	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	//alt + shift + s -> o
	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	//alt + shift + s -> r -> tap -> enter -> tap4 => enter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
