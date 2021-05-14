package java_20210514;

import java.util.ArrayList;
class Product{
	private int number;
	private String name;
	private double price;
	Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	}

public class ListDemo {
	//객체를 return
	//클래스 return: 객체가 여러가지 나오면 클래스를 return
	//객체 return: 객체가 하나이므로 그 객체를 return
	public static Product selcectByNumber() {
		//Product pro = new Product(1,"신발", 100000);
		//return pro;
		return new Product(1,"신발", 100000);
	}
	
	public static ArrayList select() {
		ArrayList list = new ArrayList();
		list.add(new Product(2,"라면", 1000));
		list.add(new Product(3,"계란", 5000));
		list.add(new Product(4,"우유", 6000));
		list.add(new Product(5,"요플레", 1500));
		
		return list;
	}
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList list = new ArrayList();
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String)list.get(i);
			System.out.println(temp); //중복을 허용하고 넣은 순서대로 출력
		}
		
		//객체타입(1개)을 return받아서 출력
		Product pro = selcectByNumber();
		System.out.printf("%d. %s %f %n", pro.getNumber(), pro.getName(), pro.getPrice());
		
		ArrayList list2 = select();
		for (int i = 0; i < list2.size(); i++) {
			Product p = (Product)list2.get(i);
			System.out.printf("%d. %s %f %n", p.getNumber(), p.getName(), p.getPrice()); //%f는 실수값을 받을때 해당
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
