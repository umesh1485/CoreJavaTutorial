package com.concurrency.pro.con.bq;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Message> bq;
	public Consumer(BlockingQueue<Message> bq) {
		this.bq=bq;
	}
	
	@Override
	public void run() {
		try {
			Message msg=null;
			while((msg=bq.take()).getMsg() !="exit") {
				Thread.sleep(2000);
				System.out.println("consumed  "+msg.getMsg());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
