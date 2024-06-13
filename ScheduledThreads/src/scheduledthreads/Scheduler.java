package scheduledthreads;

import java.util.concurrent.*;

public class Scheduler {
	public static void main(String[] args) {
		ScheduledExecutorService executor = null;
		try {
			executor = Executors.newScheduledThreadPool(2);
			ScheduledFuture<String> f1 = executor.schedule(new CallableTask(), 2, TimeUnit.SECONDS);
			System.out.println(f1.get());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(executor != null) {
				executor.shutdown();
			}
		}
	}
}