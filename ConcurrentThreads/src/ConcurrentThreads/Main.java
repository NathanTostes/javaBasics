package ConcurrentThreads;

import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new GenerateList(new ArrayList()));
		executor.execute(new GenerateList(new ArrayList()));
		executor.shutdown();
	}
}