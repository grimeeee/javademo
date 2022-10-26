package java020_thread.prob;

public class Consumer extends Thread {
	private VendingMachine vm;

	public Consumer(VendingMachine vm) {
		this.vm = vm;
	
	}
	
	@Override
	public void run() {
		for(int i = 1; i<11 ; i++) {
			System.out.println(Thread.currentThread().getName() + " : 음료수 No" + i + "꺼내먹음");
	
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}

}
