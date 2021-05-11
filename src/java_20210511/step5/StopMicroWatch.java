package java_20210511.step5;

public class StopMicroWatch extends StopWatch {
	long startTime; 
	long endTime;
	
	public void startNano() {
		startTime = System.nanoTime();
	}
	public void stopNano() {
		endTime = System.nanoTime();
	}
	
	public double getElapsedNanoTime() {
		return (double)(endTime - startTime)/1000000000;
	}
	public void execute() {
		start();
		for(long i = 0; i < 30_000_000_000l; i++) {
			
		}
	}
}
