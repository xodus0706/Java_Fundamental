package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); //1월이 0으로 시작하므로 월+1해야함
		int day = cal.get(Calendar.DATE);
		//Calendar.hour은 0~11까지 표현
		//int hour = cal.get(Calendar.HOUR_OF_DAY); 
		int hour = cal.get(Calendar.HOUR_OF_DAY); //0~23까지 표현가능 
		int minute = cal.get(Calendar.MINUTE);
		int second  = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일 %n", year, month+1, day);
		System.out.printf("%d:%d:%d %n", hour, minute, second);
		
		//Sunday~Saturday => 1~7
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer message = new StringBuffer();
		if(dayOfWeek == Calendar.SUNDAY) {
		message.append("일요일");
		}else if (dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if (dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if (dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if (dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if (dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if (dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s %n", year, month+1, day, message.toString());

		//2020년 5월 13일은 무슨 요일이었을까요?
		//날짜를 변경할 때 사용하는 메서드
		cal.set(2002, 1, 13);
		//ctrl + shift + o => 자동 import
		//java.text package에서 import
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 HH시mm분ss초 E요일");
		Date d = cal.getTime();//date를 의미
		String display = sdf.format(d);
		System.out.println(display);
			
		//해당월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
		
		
		
		}
}
