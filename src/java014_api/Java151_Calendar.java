package java014_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-10-20
 * 남은일 : 15
 */

public class Java151_Calendar {

	public static void main(String[] args) {
		
		Calendar examDay = Calendar.getInstance();	
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;
		
		//수능일
		examDay.set(examDay_year, examDay_month-1, examDay_date);
		//System.out.println(examDay.toString());
		System.out.printf("수능일 : %d-%d-%d\n",examDay_year,examDay_month,examDay_date);
		
		//오늘
		Calendar toDay = Calendar.getInstance();
		int toDay_year = toDay.get(Calendar.YEAR);
		int toDay_month = toDay.get(Calendar.MONTH) + 1;
		int toDay_date = toDay.get(Calendar.DATE);
		//System.out.println(toDay);
		System.out.printf("오늘 : %d-%d-%d\n",toDay_year,toDay_month,toDay_date);
		
		//남은일
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		//System.out.println("eventDay:" + eventDay); //1668651212794
		//System.out.println("nowDay:" + nowDay); //1666232012808
		
		//하루계산
		//System.out.println(60*60*24*1000); //초값이 Millis로 계산이 된 거니까 *1000해줘야함
		
		long endDay = (eventDay-nowDay) /(60*60*24*1000) ;
		System.out.println("남은일 : " + endDay); //초단위로 계산되어 있음 2419199986
		


	
	}

}
