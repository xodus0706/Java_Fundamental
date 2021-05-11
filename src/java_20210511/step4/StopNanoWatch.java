package java_20210511.step4;

public class StopNanoWatch {
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

}
