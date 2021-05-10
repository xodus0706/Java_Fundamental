package java_20210510;

public class CallByValueRefDemo {
	public static void ascending(int[] temp) {
		for (int i = 0; i <temp.length; i++) {
			for (int j = 0; j < temp.length - (i + 1); j++) {
				if (temp[j] < temp[j + 1]) {
					int temp2 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp2;
				}
				
			}
		}
	}
	
	
	
	public static void change(int i, int [] j) {
		i = 20;
		j[3] = 400;
	}
	public static void main(String[] args) {
		int i = 10;
		int [] j = {1,2,3,4};
		System.out.println(i+","+j[3]);
		change(i,j);
		System.out.println(i+","+j[3]);
		
		int [] lotto = {3,5,12,45,23,1};
		//int []  lotto2 = ascending(lotto); => call by reference에 의해 이미 같은 값을 지녔기때문에 return할 필요도 없고 class화만 하면된다. 
		ascending(lotto);
		for (int value :  lotto) {
			System.out.print(value+"\t");
		}
		
		
		
		
}
	}


