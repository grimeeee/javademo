package java013_api.prob;

/*[문제]
 * 2~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 배열에서 소수를 구하여 출력하는 primeNumber() 메서드를 각각 구현하시오.
 * [출력결과]
<< 발생된 난수 >>
*  15 7  4  4  8  7  2  11  17  5 
<< 소수 숫자 >>
*  7 7 2 11 17 5
*  */
import java.util.Random;

public class Prob003_random {

	public static void main(String[] args) {
		int[] array = makeArray();
		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n<< 소수 숫자 >>");
		primeNumber(array);
	}// end main( )

	private static int[] makeArray() {
		// 난수값를 발생시킨후 반환하는 프로그램을 구현하시오.
		
		int[] num = new int[10];
		
		Random ran = new Random();
		for(int i = 0 ; i<num.length;i++) {
			num[i] = ran.nextInt(20) + 1;
		}
		
		
		return num;
	}// end makeArray()

	public static void primeNumber(int[] array) {
		// array배열에서 소수만 출력하는 프로그램을 구현하시오.
	       int total = 0;
	        int[] ss = array;
	        for (int i = 2; i <= num; i++) {
	        	
	        }
	        
//	        while (num <= n) {
//	            for (int i = 2; i <= num; i++) {
//	                if (num % i == 0 && i != num) { // 입력받은 숫자 이외에 다른 숫자로 나누어 떨어질 경우 ( 소수가 아님 ) break
//	                    break;
//	                }
//	                if (num % i ==0 && i == num) { // for문의 i가 증가해 본인과 같아져 나누어 떨어질 경우 ( 소수 )
//	                    total++; // 소수의 갯수를 count하는 total 증가
//	                }
//	            }
//	            ss++;
//	        }
//	        return;
//	    
		
		
	}// end primeNumber()

}// end class
