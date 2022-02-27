package com.concurrency.pro.con.bq;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	public BlockingQueue<Message> bq;
	public Producer(BlockingQueue<Message> bq) {
		this.bq=bq;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				bq.put(new Message(i+" "));
				System.out.println("produced "+i);
				Thread.sleep(2000);
			}
			bq.put(new Message("exit"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
