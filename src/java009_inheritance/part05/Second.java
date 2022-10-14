package java009_inheritance.part05;
import java.lang.Override;

public class Second extends First {
			int b = 20;
			
			@Override
			void display() {
				System.out.println("b= " +b);
				
			}

			void superThisMethod() {
				super.display();
				this.display();//this 안써도 됨 
				
			}
			
			

}
