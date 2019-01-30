/*
 * Thread is a light weight process
 * smallest independent unit of execution
 * printing thread object gives 3 values 1.Name 2.priority(1-10) 3.ThreadGroup
 */

package com.psl.client;

public class Client {
	public static void main(String[] args) {
		
		/* forGetting Access to the current thread or main thread in this case we use current thread
		 * System.out calls the toString method on objects passed
		 */
		Thread t = Thread.currentThread();
		System.out.println(t); 
		for(int x = 1; x <= 5 ; x++)
		{
			System.out.println(x);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		t.setName("My Main Thread");               //setName is used to rename thread
		System.out.println(t);
	}
}
