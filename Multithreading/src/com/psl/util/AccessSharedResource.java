package com.psl.util;

public class AccessSharedResource extends Thread {
	private SharedResource sharedResource;
	
	public AccessSharedResource(SharedResource sharedResource)
	{
		this.sharedResource = sharedResource;
	}
	
	@Override
	public void run() {
		synchronized(sharedResource){
		System.out.println(sharedResource.readCurrentValue());
	}
		}
}
