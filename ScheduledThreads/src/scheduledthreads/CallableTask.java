package scheduledthreads;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
	@Override
	public String call() throws Exception {
		String message = "Helllo world by " + Thread.currentThread().getName();
		return message;
	}
}