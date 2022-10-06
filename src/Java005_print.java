package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long INum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; // true or false,,, 1 or 0 (x)
		String sData = "java"; // 문자열인식(0개 이상)

		System.out.println(bNum + "," + sNum); // 2,4

		/*
		 * System.out.println("출력형식", 값1, 값2, 값...) 출력기호 %d : 정수(byte, short, int, long)
		 * %f : 실수 (float, double) %b : 논리 (boolean) %c : 문자(char) %s : 문자열(string) %% :
		 * % \n : 줄바꿈 \t : 탭
		 */

		System.out.printf("%d %d %d %d %f %f %b %c %s\n", 
				bNum, sNum, xNum, INum, fNum, dNum, eNum, cData, sData); 
		//2 4 5 6 2.500000 7.400000 true a java

		System.out.printf("%d %% %d = %d\n", 5,2, (5%2)); //5 % 2 = 1
		
		System.out.print("java");
		System.out.print("program"); //줄바꿈 일어나지않음.
		System.out.println();
		System.out.println("jsp");
		System.out.println("test"); //ln 자동 줄바꿈 실행

	}

}
