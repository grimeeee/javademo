package java014_api;

import java.text.SimpleDateFormat;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html

public class Java148_System {

	public static void main(String[] args) {
			//currentTimeMillis() : 1970. 1. 1부터 초단위로 누적한 값을 밀리세컨드로 리턴하다.
			//하루는 86400초이다. 1초는 1000밀리세컨드이다.
			long curr = System.currentTimeMillis();
			System.out.println(curr);
	
			String pattern = "yyyy-MM-dd   HH:mm:ss  a  EEEE"; //HH(24시간),hh(12시간),EEE = 목(요일)
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			//long -> Long -> Object
			//auto boxing -> up-casting
			String date = sdf.format(curr);
			System.out.println(date);
	}

}
