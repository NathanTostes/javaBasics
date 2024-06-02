package Threads;

public class PrintNumbers implements Runnable {
	int threadId;

	public PrintNumbers(int threadId) {
		this.threadId = threadId;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println("Thread (" + threadId + ") print: " + i);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("PrintNumbers ID " + threadId + " finalizing");
	}
}