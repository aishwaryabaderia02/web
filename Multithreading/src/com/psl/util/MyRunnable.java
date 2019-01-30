/*
 * a thread will be required to run the thread and that thread will be a thread object
 * higher priority thread gets more CPU time, number of priority in windows is 7
 */

package com.psl.util;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 1; x <= 5; x++) {
			System.out.println(String.format("%d %s", x, Thread.currentThread()
					.getName()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
