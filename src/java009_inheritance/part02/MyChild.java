package java009_inheritance.part02;

public class MyChild extends MyFather {
		public MyChild() { //2
			super();  //3 (자손-> 부모 호출할때만 사용가능)
			System.out.println("MyChild"); //11
		} //12
}
