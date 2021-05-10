package java_20210506;

public class Customer {
	//고객관리는 class, 고객은 제각각이므로 instance
			//인스턴스의 class변수
			String name;
			String email;
			String phone;
			//인스턴스의 primitive변수
			int age;
			double balance;
			boolean released;
			//각각 이자율이 다르다고하면 instance를 갖는게 맞지만
			//이자율이 모든 고객에게 공통적으로 같은 경우 static을 써야한다.
			static double interestRate;
}
