package scheduledthreads;

public class RunnableTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello World by " + Thread.currentThread().getName());	
	}
}