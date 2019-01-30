/*
 * There are two types of lock Class level and object level lock  and the object created of this class could be accessed simultaneously by two different threads
 */

package com.psl.client;

import com.psl.util.AccessSharedResource;
import com.psl.util.SharedResource;
import com.psl.util.UpdateSharedResource;

public class SynchroniztionDemo {
	public static void main(String[] args) {

		SharedResource sharedResource;
		sharedResource = new SharedResource(100_000_000_000L);
		new UpdateSharedResource(sharedResource).start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new AccessSharedResource(sharedResource).start();
	}
}
