package java_20210503;

public class RevStarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 4; i >= 0 ; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
