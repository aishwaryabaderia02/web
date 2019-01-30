package com.psl.util;

public class AccessCommonResource extends Thread{
	private CommonResource commonResource;
	
	public AccessCommonResource(CommonResource commonResource)
	{
		this.commonResource = commonResource;
	}
	
	@Override
	public void run(){
		try{
			commonResource.getLock();
		
		
		for(int x = 0; x < commonResource.getSize(); x++)
		{
			System.out.println(commonResource.getNumber(x));
		}
		commonResource.releaseLock();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	}

}
