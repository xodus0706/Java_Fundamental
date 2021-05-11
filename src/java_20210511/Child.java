package java_20210511;

public class Child extends Parent {
	String phone;
	double weight;
	double height;
	//매개변수있는 생성자
	public Child(String name, String address, int age, String phone, double weight, double height) {
		//자기자신 class에 있는 것처럼 사용
		//부모의 생성자를 가져옴
		super(name, address, age); 
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	//매개변수없는 디폴트 생성자
		public Child( String phone, double weight, double height) {
			super();
			this.phone = phone;
			this.weight = weight;
			this.height = height;
		}

}
