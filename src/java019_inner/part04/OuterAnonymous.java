package java019_inner.part04;

public class OuterAnonymous {
	private int x; 
	
	InnerAnonymous ta = new InnerAnonymous() {
		
		@Override
		void prn() {
			System.out.println("prn");
			
		}
	}; //InnerAnonymous~ 하나의 문장이므로 세미콜론 찍어야 한다.
	
	public void display() {
		ta.prn();
		
		new InnerAnonymous() {
			
			@Override
			void prn() {
			System.out.println("prn2");
				
			}
		}.prn();
	}
}
