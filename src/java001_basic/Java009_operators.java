package java001_basic;

public class Java009_operators {
 public static void  main(String[] args) {
	 int x = 3;
	 
	 //전위 연산자
	 ++x ; // x = x + 1, x+-1
	 System.out.println(x);
	 
	 --x;
	 System.out.println(x);
	 
	 int y = 5;
	 
	 //후위연산자
	 y++;
	 System.out.println(y);
	 
	 y--;
	 System.out.println(y);
	 
	 //리터널은 증감연산자를 사용할 수 없다.
	 //10++;
	 
	 final int NUM = 4;
//	 NUM++
	 
	 
	
}
}
