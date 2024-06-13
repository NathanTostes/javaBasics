package multithreading;

import java.util.*;
import java.util.concurrent.*;

public class Main {
	private static long total = 0;
	private static LinkedBlockingQueue<Long> list = new LinkedBlockingQueue<>();
	private static ExecutorService executor = Executors.newFixedThreadPool(3);
	private static Runnable r1;
	private static Runnable r2;
	private static Runnable r3;

	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
			total += list.poll();
			total += list.poll();
			total += list.poll();
			System.out.println("Operation result is: " + total);
			System.out.println("--------------------------------");
		});
		r1 = () -> {
			while (true) {
				sleep();
				System.out.println(Thread.currentThread().getName() + ": starting");
				list.add(Math.round(Math.random() * 10));
				System.out.println(Thread.currentThread().getName() + ": has finished");
				await(cyclicBarrier);
			}
		};
		r2 = () -> {
			while (true) {
				sleep();
				System.out.println(Thread.currentThread().getName() + ": starting");
				list.add(Math.round(Math.random() * 10));
				System.out.println(Thread.currentThread().getName() + ": has finished");
				await(cyclicBarrier);
			}
		};
		r3 = () -> {
			while (true) {
				sleep();
				System.out.println(Thread.currentThread().getName() + ": starting");
				list.add(Math.round(Math.random() * 10));
				System.out.println(Thread.currentThread().getName() + ": has finished");
				await(cyclicBarrier);
			}
		};
		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
	}

	private static void sleep() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void await(CyclicBarrier cyclicBarrier) {
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}