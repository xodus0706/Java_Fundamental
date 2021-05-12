package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		double d  = Math.ceil(4.3);
		System.out.println(d);
		
		d = Math.floor(4.9);
		System.out.println(d);
		
		int  i = Math.round(2.6f);
		System.out.println(i);

		long l = Math.round(2.6);
		System.out.println(l);
		
		d = Math.abs(-4.2);
		System.out.println(d);
		
		d = Math.max(4.5, 6.2);
		System.out.println(d);
		
		d = Math.min(2.4, 1056.26);
		System.out.println(d);
		
		//double로 하면 2.0이 나오는데 2가 나오기 위해서 long으로 변환한다.
		//double 8바이트이므로 int는 4바이트인 상황에서 변환 불가능하다.
		l = (long)Math.sqrt(4);
		System.out.println(l);
		
		//2^3
		l = (long)Math.pow(2, 3);
		System.out.println(l);
		
		d = Math.random();
		System.out.println(d);
		
	}
	

}
