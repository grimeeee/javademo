package java003_statements;

public class Java025_for {

	public static void main(String[] args) {
		//누적된 값이 최초로 15이상일때 까지만 반복문을 수행

		int sum = 0;
		int i;
		
		for(i=1;; i++) { //언제나 true면 무한루프 __생략: 무한루프
			sum = sum + i;
			if(sum>=15) {
				break;
			}
		}
		System.out.printf("i=%d sum=%d\n", i, sum);
	}

}
