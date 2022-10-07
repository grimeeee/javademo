package java004_array;

/*
 * [출력결과]
 *  1   2    3   4   5
 * 10  9    8   7   6 
 * 11 12 13 14 15
 * 20 19 18 17 16
 */
public class Java048_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

//		System.out.printf("%4d %4d %4d %4d %4d\n", num[0][0],num[0][1],num[0][2],num[0][3],num[0][4]);
//		System.out.printf("%4d %4d %4d %4d %4d\n", num[1][4],num[1][3],num[1][2],num[1][1],num[1][0]);
//		System.out.printf("%4d %4d %4d %4d %4d\n", num[2][0],num[2][1],num[2][2],num[2][3],num[2][4]);
//		System.out.printf("%4d %4d %4d %4d %4d\n", num[3][4],num[3][3],num[3][2],num[3][1],num[3][0]);

		for(int row=0; row<num.length;row++) {
			for(int col=0; col<5;col++) {
				if(row%2==1) {
					System.out.printf("%4d", num[row][num[row].length-1-col]);
				}else 
				System.out.printf("%4d", num[row][col]);
				
			}
			System.out.println();
		}
		
	}

}