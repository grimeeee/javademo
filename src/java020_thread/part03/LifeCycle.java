package java020_thread.part03;

/*
 * 스레드 생명주기 (Thread Life Cycle)
 * start() - 실행준비상태(RUNNABLE) - run() - TERMINATED
 * 														sleep(), wait - 대기상태(WATTING) _실행상태run에서 만나면 대기상태로 빠짐
 */

public class LifeCycle extends Thread{
	
	public LifeCycle() {
		
	}
	
	@Override
	public void run() {
		System.out.println(getState());
	}

}
