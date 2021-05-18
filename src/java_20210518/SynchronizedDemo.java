package java_20210518;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	public void run() {//public synchronized void run()
		synchronized(SynchronizedDemo.class) {//or this
		for(int i = 0; i< 1000; i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s %n,",
					x,y,threadName);
			}
		}
	}
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		//서로 다른 스레드가 같은 객체를 공유하는 경우에만 synchronized가 적용된다.
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
		
	}

}
