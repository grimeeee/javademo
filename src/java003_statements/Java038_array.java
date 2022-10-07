package java003_statements;

public class Java038_array {

	public static void main(String[] args) {
		// Javascript
		// let myArray = [1,2,3,"홍길동","아무개"]

		// Java
		int[] data = { 10, 20, 30 };
		//초기값을 할당하면서 배열생성할때는 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] { 90, 80, 40 };
		
		for(int i=0; i<data.length;i++) {
			System.out.printf("Jumsu[%d]=%d\n", i , jumsu[i]); 
		}
System.out.println("=====Reverse=====");
for(int i = jumsu.length-1; i>=0;i--) {
	System.out.printf("Jumsu[%d]=%d\n", i , jumsu[i]); 
}
	}
	

}
