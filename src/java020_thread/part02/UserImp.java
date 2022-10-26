package java020_thread.part02;

public class UserImp implements Runnable{ //Runnable interface에서는 run메소드밖에 없음
	
	public UserImp() {
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), i); //Thread.currentThread() : 현재 수행중인 객체에 대한 정보
		}
		
	}

}
