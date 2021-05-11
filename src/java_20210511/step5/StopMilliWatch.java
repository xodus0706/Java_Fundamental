package java_20210511.step5;

public class StopMilliWatch extends StopWatch{
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000;
	}
	public void execute() {
		start();
		
	}



}
