package java014_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 */

public class Java150_Calendar {

	public static void main(String[] args) {
			
			Calendar cal = Calendar.getInstance();
			int year = 2016;
			int month = 2;
			
			cal.set(Calendar.YEAR, 2016);
			cal.set(Calendar.MONTH, month-1);
			System.out.println(cal.toString());
			int date = cal.getActualMaximum(Calendar.DATE);
			cal.set(Calendar.DATE,date);
			System.out.println(cal.toString());
			
			String day = " ";			
			int da = cal.get(cal.DAY_OF_WEEK);
			switch(da) {
				case 1: 
				day = "일"; break;
				case 2:
					day =	"월"; break;
				case 3:
					day =	"화";break;
				case 4:
					day =	"수";break;
				case 5:
					day =	"목";break;
				case 6:
					day =	"금";break;
				case 7:
					day =	"토";break;
					
			}
			System.out.printf("%d-%d-%d %s요일", year,month,date,day);
			
	}

}
