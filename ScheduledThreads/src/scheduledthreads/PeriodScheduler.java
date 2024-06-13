package scheduledthreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PeriodScheduler {
	public static void main(String[] args) {
		ScheduledExecutorService executor = null;
		try {
			executor = Executors.newScheduledThreadPool(2);
			executor.scheduleAtFixedRate(new RunnableTask(), 0, 1500, TimeUnit.MILLISECONDS);
			executor.awaitTermination(4500, TimeUnit.MILLISECONDS);  
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executor.shutdownNow();
		}
	}
}