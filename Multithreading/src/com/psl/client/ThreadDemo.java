/*
 * join method is called By "a" Thread "on a" Thread 
 * the main thread will be in a blocked state till t1,t2,t3 are not completed (we want t1,t2,t3 to run first and after their execution 
 * is finished thread rt1,rt2,rt3 start) 
 */

package com.psl.client;

import com.psl.util.MyRunnable;
import com.psl.util.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("First");
		MyThread t2 = new MyThread("Second");
		MyThread t3 = new MyThread("Third");
		t1.start();
		t2.start();
		t3.start();
		try{
		t1.join();
		t2.join();
		t3.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		MyRunnable r3 = new MyRunnable();
		
		Thread rt1 = new Thread(r1,"Fourth");
		Thread rt2 = new Thread(r2,"Fifth");
		Thread rt3 = new Thread(r3,"Sixth");

		/*
		 * r1 r2 r3 are objects
		 */
		rt1.start();
		rt2.start();
		rt3.start();
	}
}
