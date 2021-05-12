package java_20210511;

public class Parent {
	String name; 
	String address;
	int age;
	//alt + shift + s -> c => 디폴트 생성자
	public Parent() {
			super(); //매개변수없는 디폴트 생성자의 super는 object를 의미한다.
				 //밑에 아무것도 없으므로 기본값 null로 들어간다.
	}
	
	//alt + shift + s -> o => 매개변수 있는 생성자	
	public Parent(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}





	

}
