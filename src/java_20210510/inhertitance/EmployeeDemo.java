package java_20210510.inhertitance;


public class EmployeeDemo {

	public static void main(String[] args) {
			Employee e1 = new Employee();
			e1.name = "김태연"; //Employee 부모 클래스인 Customer의
			                  //모든 멤버변수(name, phone1, phone2, phone3)를 사용할 수 있음
			e1.phone1 = "010";
			e1.phone2 = "1234";
			e1.phone3 = "5678";
			e1.zipcode = "12312";
			e1.addr1 = "서울";
			e1.addr2 = "용산구";
			e1.id = "xodus0706";
			e1.pwd = "1234";

	}

}
