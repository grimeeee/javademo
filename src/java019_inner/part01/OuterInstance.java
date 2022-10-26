package java019_inner.part01;

public class OuterInstance {
	private int num;
	private int data;
	
	public void display() {
		System.out.println("display");
	}
	
	class Innertance{
		public void run() {
			num = 10;
			System.out.println(num);
		}
	}

}
