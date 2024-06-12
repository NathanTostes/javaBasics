package ConcurrentThreads;

import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		Runnable generateList = new GenerateList(new ArrayList());
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(generateList);
		
		executor.shutdown();
	}
}