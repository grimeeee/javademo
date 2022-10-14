package java009_inheritance.part01;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html

public class Father /*extends Object*/ {
	int a = 3;

	public Father() {
		System.out.println("Father");
	}

	void display() {
		System.out.println("a=" + a);
	}

}
