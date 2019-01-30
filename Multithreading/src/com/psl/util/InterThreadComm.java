package com.psl.util;

public class InterThreadComm {
	public static void main(String[] args) throws InterruptedException {
		CommonResource commonResource;
		commonResource = new CommonResource();
		
		new UpdateCommonResource(commonResource).start();
		
		Thread.sleep(100);
		
		new AccessCommonResource(commonResource).start();
	}
}
