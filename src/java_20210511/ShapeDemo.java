package java_20210511;

public class ShapeDemo {
	public static void main(String[] args) {
		ShapeManager  manager = ShapeManager.getInsatance();
		Triangle t = new Triangle();
		manager.run(t);
		
		String str = "hello";
		String  str2 = "hello";
		String str3 = new String ("hello");
		String str4 = new String ("hello");
		System.out.println(str == str2);
		System.out.println(str3 = str4);
		System.out.println(str == str4);
	}
}
