package java_20210506;

public class CustomerDemo {
	//선언생성, 할당, 출력
	public static void main(String[] args) {
		Customer c1 = new Customer(); //class를 instance화
		c1.name = "김태연"; //instance가 되었기에 이제 .으로 표현
		c1.age = 20;
		c1.email = "test.test.com";
		c1.phone = "010-9090-9090";
		c1.balance = 1_000_000;
		c1.released = false; //탈퇴
		//클래스 변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
		//변수로도 접근가능하나 권장하지 않음 예) c1.interestRate =  6.2;
		Customer.interestRate = 6.2; //독립된 변수이기에 Customer로 묶어버림
		//final 변수는 갑슬 재할당 할 수 없음
		//Customer.BANKNAME = "신한은행";
		
		System.out.printf("%s,%d,%s,%s,%f,%s %n",
				c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.released);
		
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 30;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-1231-2222";
		c2.balance = 50_000_000_000_000l; //조 단위이기에 long을 사용해야함
		c2.released = false;
		//c2.interestRate = 8.2;
		Customer.interestRate = 8.2;
		System.out.printf("%s,%d,%s,%s,%f,%s %n",
				c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.released);
		
		Customer c3 = c2; //array와 마찬가지로 c3와 c2가 하나의 기차를 탄것이다.
                          //만약 또다른 독립된 것을 만들고 싶다면 Customer c3  = new Customer()
		c3.name = "손정의1";
		
		System.out.printf("%s,  %s %n", c2.name, c3.name);
		//System.out.printf("%f", c1.interestRate); //8.2가 나옴 
		// interestRate는 static으로 독립된 할당. 공용분수
		System.out.printf("%f", Customer.interestRate);
	}

}
