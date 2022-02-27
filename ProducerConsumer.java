package com.concurrency.pro.con.bq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		BlockingQueue<Message> bq = new ArrayBlockingQueue<Message>(10);
		Producer p = new Producer(bq);
		Consumer c = new Consumer(bq);
		new Thread(p).start();
		new Thread(c).start();

	}

}
