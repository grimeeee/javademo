package java013_api;

import java.util.StringTokenizer; 

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer("문자열", "구분자")
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다.
		//StringTokenizer st = new String("java,jsp", ",");
		
		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());

//		int count = st.countTokens();
//		for(int i = 0 ; i < count; i++) {
//			System.out.println(st.nextToken());
//		}
		
		while(st.hasMoreTokens()) { //메소드명이 has, is 일 경우 리턴타입이 거의 논리값
			System.out.println(st.nextToken());
			
		}
	}

}
