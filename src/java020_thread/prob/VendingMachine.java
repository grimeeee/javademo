package java020_thread.prob;

import java.util.Stack;

public class VendingMachine {
	Stack store = new Stack();
	
	synchronized public String getDrink() {
		while(store.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop().toString();
		
	}
	
	public static void putDrink(String drink) {

	}

}
