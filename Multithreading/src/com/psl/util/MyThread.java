/*
 * Threads implements runnable and extends class thread , we need to override the run method
 * when a thread is sleeping it gives opportunity to other thread to run by using context switch
 */
package com.psl.util;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for(int x = 1; x <= 5 ; x++)
		{
			System.out.println(String.format("%d %s",x, getName()));
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
