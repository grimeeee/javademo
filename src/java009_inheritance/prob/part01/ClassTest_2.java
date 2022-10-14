package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1 { // 1 ClassTest_1을 상속받아 ClassTest_2 클래스를 정의한다.
	ClassTest_2() {

	}

	String department; // 2 하위클래스에 String department 변수를 선언한다.

	public ClassTest_2(String getName, int getSalary, String department) {
				

	} // 3 하위클래스를 객체생성시 인수값 3개를 넘겨준다(이름, 연봉, 부서)



	@Override
	public void getInformation() {
		super.getInformation();
	}
	
//	 4  아래와 같이 출력되도록 상위클래스  getInformation()메소드를 오버라이딩한다. 
//	 이름:이지나  연봉:3000  부서:교육부


	@Override
	public void prn() {
		System.out.println("서브클래스");
	}
	// 5 하위클래스에 prn()메소드 오버라이딩
	// => "서브클래스"문자열 출력

	
	
	public void callSuperThis() {
		super.prn();
		prn();
		

	}
	
	// 6 하위클래스에 callSuperThis()메소드 정의

	
}
