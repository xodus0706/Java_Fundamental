package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar2 {
	private Calendar cal;
	public Calendar2() {
		cal = Calendar.getInstance();
	}

//매개변수 3개
	public void print(int year, int month, int day) {
		cal.set(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 E요일입니다.");
		System.out.println(sdf.format(cal.getTime()));
	}

//매개변수 2개
	public void print(int year, int month) {
		cal.set(year, month-1,1);
		System.out.println(year + "년" + month + "월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//1-> 일요일, 2-> 월요일,,,,,7->토요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int count = 0;
		for (int i = 0; i < dayOfWeek - 1; i++) {
			System.out.print("\t");
			count++;
		}

		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i + "\t");
			count++;
			if (count % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
//매개변수 1개
	public void print(int year) {
		for(int i = 1; i<=12; i++) {
			print(year,i);
		}

	}

}
