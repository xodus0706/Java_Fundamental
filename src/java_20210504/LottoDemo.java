package java_20210504;

public class LottoDemo {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 반환
		// double random = Math.random()*45; 0보다 크고 45보다 작은 double 변환
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 반환
	
						
				int[] lotto = new int[6];
				for(int i=0;i<lotto.length;i++) {
					//1보다 크거나 같고 45보다 작은 임의의 int 반환
					boolean isExisted = false;
					int random = (int)(Math.random() * 45)+1;
					for(int j=0;j<i;j++) {
						if(random == lotto[j]) {
							isExisted = true;
							break;
						}
					}
					if(isExisted) {
						i--;
					}else {
						lotto[i] = random;
					}
				}
				
				//오름 차순정렬
				for (int i = 0; i < lotto.length; i++) {
					for (int j = 0; j < lotto.length - (i + 1); j++) {
						if (lotto[j] > lotto[j + 1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j + 1];
							lotto[j + 1] = temp;
						}
						
					}
				}
				
				for(int i=0;i<lotto.length;i++) {
					System.out.print(lotto[i] + "\t");
				}
				
				//good code
			}
		}