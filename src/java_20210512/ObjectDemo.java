package java_20210512;

class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

}

public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test ("성영한");
		Test t2 = new Test("성영한");
		Test t3 = t2;
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		//t2와 t3 equals가 같게 나오게 할려면 두 hashcode가 같아야한다.
		System.out.println(t2.equals(t3));
	
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(t3.hashCode());
	
	
	System.out.println(t1);
	
	}
}
