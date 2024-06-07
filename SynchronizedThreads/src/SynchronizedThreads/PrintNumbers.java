package SynchronizedThreads;

public class PrintNumbers implements Runnable {
	@Override
	public synchronized void run() {
		System.out.println("Starting");
		for(int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "s...");
		}
		System.out.println("Finished");
	}
}