package java003_statements;

public class Java032_for {

	public static void main(String[] args) {
int data;
		for (int row = 0; row<=3; row++) {
			data = 1; 
			for(int col=1; col<=5; col++) {
				System.out.printf("%4d", col);
			}
			System.out.println();
		}
	}//end main()

}//end class
