package java002_statements;

public class Java020_if {
	/*
	 * [문제] data변수에 저장된 값이 대문자이면 "대문자입니다.", 소문자이면 "소문자입니다." 그 외는 "기타입니다." 로 출력하는
	 * 프로그램을 구현하세요.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		char data = 'd';

		if (data >= 'A' && data <= 'Z') {
			System.out.printf("%c는 대문자입니다.", data);
		} else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다.", data);
		} else {
			System.out.printf("%c는 기타입니다.", data);
		}
	}// end main()

}// end class
