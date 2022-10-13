package java008_static_access.part02;

public class OrderStatic {
static {
	System.out.println("static");
}

public OrderStatic() {
	System.out.println("constructor");
}

public void display() {
	System.out.println("display");
}

}
