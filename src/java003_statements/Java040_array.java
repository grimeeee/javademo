package java003_statements;

public class Java040_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수
		int even = 0; // 짝수

		for(int i = 0;i<num.length;i++) {
			if(num[i] % 2 ==0) {
			even = even+num[i];	
		}else {
			odd = odd+num[i];
		}
		
		}
		System.out.printf("홀수: %d\n",odd);
		System.out.printf("짝수: %d\n",even);
}
}
