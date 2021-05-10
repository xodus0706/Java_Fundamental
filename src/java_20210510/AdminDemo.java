package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		//생성자의 접근한정자가 결정
		//public이기 때문에
		Admin a = new Admin("xodus0706", "123","xodus0706@naver.com", 20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		
		
		
		Admin a1 = new Admin();
		a1.setId("xodus0706");
		a1.setPwd("123");
		a1.setEmail("xodus0706@naver.com");
		a1.setLevel(20);
		 
	}

}
