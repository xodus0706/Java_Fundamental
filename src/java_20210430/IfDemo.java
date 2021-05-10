package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		// Run Configurations => Arguments => Program arguments에 숫자를 집어넣음
		// 이렇게 하면 compile하지 않고 실행할 수 있음
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "가을";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "겨울";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");

		int a = 125900;
		double d = 125234.789;
		String name = "KIM TAEYEON";

		// 앞에 변수의 개수만큼 뒤에 같은 개수의 변수를 넣어주면 됨
		// %10d는 숫자를 10자리 맞춰주는 것임
		// 만약 %010d이라 하면 앞에 비어있는 부분을 0으로 채워줌
		// %-10d는 뒤쪽 비어있는 부분이 10자리 채우고 있음
		// 정수는 %d, 실수는 %f, 문자열은 %s
		// %,d는 세자리마다 ',' 표현
		// %,.2f는 소수점 들째자리까지 표현하고 세자리마다 ','표현
		System.out.printf("a is %,d.%n", a);
		System.out.printf("d is %,.2f.%n", d);
		System.out.printf("I am %s.%n", name);
		System.out.printf("I am %s,%d,%f.%n", name, a, d);

		
		int a1 = 100;
		String msg = "";
		//if문 안에는 조건이 들어가야지 값이 들어가면 안된다.
		if (a1 % 2 == 0) {
			msg = "even";
		} else {
			msg = "odds";
		}
		System.out.println(msg);

		
		//조건연산자 ?:
		msg = (a1 % 2 == 0) ? "even" : "odds";
		System.out.println(msg);

		
		
		
		
		
		
		
		
		
	}
}
