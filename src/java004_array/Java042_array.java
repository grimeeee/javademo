package java004_array;

public class Java042_array {
/*
 *  data배열에서 대문자의 갯수를 출력하는 프로그램 구현
 *  
 *  [출력결과]
 *  대문자 갯수: 2
 *  
 */
	public static void main(String[] args) {
		char[] data = new char[] { 'a', 'b', 'F', 'R', 'a' };
		int cnt = 0; // 대문자 갯수를 저장하기 위한 변수
		
		move:
		for(int i=0; i<data.length; i++) {
			if(data[i] >= 'A' && data[i] <= 'Z') {
				cnt++;
			}else 
				continue move;
		}
		
//		System.out.printf("대문자 갯수: %d", cnt);
		System.out.println("대문자 갯수: " + cnt);
	}
}
