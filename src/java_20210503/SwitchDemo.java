package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Run Configurations => Arguments => Program arguments에 숫자를 집어넣음
				// 이렇게 하면 compile하지 않고 실행할 수 있음
		
				int month = Integer.parseInt(args[0]);
				String season = "";
				switch(month) {
				case 12 :
				case 1 :
				case 2 :season = "겨울";break;
				case 3 :
				case 4 :
			    default: season = "없는 계절"; break;
				case 5 :season = "봄";break;
				case 6 :
				case 7 :
				case 8 :season = "여름";break;
				case 9 :
				case 10 :
				case 11 :season = "가울";
				}
				System.out.printf("%d월은 %s입니다.",month,season);
				
				
				
				
				
	}

}
