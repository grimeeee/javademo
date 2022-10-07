package java004_array;
//https://www.techonthenet.com/unicode/chart.php

public class Java041_array {

	public static void main(String[] args) {

		int[] data1 = new int[3]; //0기본값
		long[] data2 = new long[3]; //0L
		float[] data3 = new float[3]; //0.0F
		double[] data4 = new double[3]; //0.0
		char[] data5 = new char[3]; //\u0000
		boolean[] data6 = new boolean[3]; //false
		String[] data7 = new String[3];
		
		for(int i = 0; i < data7.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data7[i]);
		}
System.out.println("============================");
char a= ' ';
char b = '\u0020'; //공백
char c = '\u0000';
char d = 0; //숫자

System.out.println(a==b);
System.out.println(c==d);
	}

}
