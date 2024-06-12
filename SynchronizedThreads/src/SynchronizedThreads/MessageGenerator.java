package SynchronizedThreads;

import java.util.*;

public class MessageGenerator implements Runnable {
	private int start;
	private int end;
	private Collection<String> messageList;

	public MessageGenerator(int start, int end, Collection<String> messageList) {
		this.start = start;
		this.end = end;
		this.messageList = messageList;
	}

	@Override
	public void run() {
		synchronized(MessageGenerator.class) {
			for (int i = start; i < end; i++) {
				messageList.add("Message " + i);
			}
		}
	}
}