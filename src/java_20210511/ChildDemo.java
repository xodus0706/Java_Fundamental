package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
	Child child = new Child("010-1234-9858",50.3,155.2);
	System.out.println(child.name);
	System.out.println(child.address);
	System.out.println(child.age);
	System.out.println(child.phone);
	System.out.println(child.weight);
	System.out.println(child.height);
	System.out.println(child.name);
	
	Child child2 = new Child("김태연", "서울", 30, "010-1234-9858",50.3,155.2);
	System.out.println(child2.name);
	System.out.println(child2.address);
	System.out.println(child2.age);
	System.out.println(child2.phone);
	System.out.println(child2.weight);
	System.out.println(child2.height);
	System.out.println(child2.name);


	}
}
