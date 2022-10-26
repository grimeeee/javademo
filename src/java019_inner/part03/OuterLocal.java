package java019_inner.part03;

public class OuterLocal {
	private int x;
	static int y;
	final private int z = 10; // Local class에서는 final이 중요!

	public void call(int a) {
		final int b = 20;
		int c = 30;
		//a = 300;
		//c = 500;

		System.out.printf("a=%d\n", a);

		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				// z=20;

				System.out.println("x= "+x);
				System.out.println("y= "+y);
				System.out.println("a= "+a); //내부클래스에서 매개변수 참조하려면 final이 사용되어야함. (method에 있는 것을 참조할 때)
				System.out.println("b= "+b);
				System.out.println("c= "+c); //새로운 값을 할당한 것이 없으면 final로 처리가 되서 이상없이 출력가능.
			}
		}
		
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}

}
