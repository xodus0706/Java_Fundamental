//패키지명도 식별자에 포함 되기 때문에 식별자 규칙을 지켜야한다.
package java_20210429;
//클래스명도 식별자에 포함됨
//클래스명의 첫글자는 대문자로, 두 단어가 합쳐진 경우에는 두번째 단어의 첫글자도 대문자로 표기한다
public class IdentifierDemo {
//	메서드명도 식별자에 포함된다
//	클래스명을 제외한 모든 이름은 소문자로 시작한다
	public static void main (String[] args) {
		int age = 20;
		String name = "Hello";
//		첫글자는 숫자를 사용할 수 없음
//		String 1fatherName = "John";
//		공백을 사용할 수 없음
//		String mother Name = "Michell";
//		에약어를 사용할 수 없음
//		String void = "Empty";
//		자바는 유니코드를 사용하기에 한국어를 쓸 수 있지만 사용 권장 안함
		String 이름 = "홍길동";
		System.out.println(이름);
		System.out.println(age);
		System.out.println(name);
	}
}
