package Multithreading;

import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		Runnable runnableHelloWorld = new HelloWorldThread();
		 Thread t0 = new Thread(runnableHelloWorld);
		 Thread t1 = new Thread(runnableHelloWorld);
		 Thread t2 = new Thread(runnableHelloWorld);
		 Thread t3 = new Thread(runnableHelloWorld);
		 Thread t4 = new Thread(runnableHelloWorld);
		 t0.start();
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
	}
}