package com.psl.util;

public class UpdateCommonResource extends Thread {
	private CommonResource commonResource;

	public UpdateCommonResource(CommonResource commonResource) {
		this.commonResource = commonResource;
	}
	
	@Override
	public void run(){
		try{
		commonResource.getLock();
		
		for(int x = 0 ; x < commonResource.getSize() ; x++)
		{
			commonResource.setNumber(x, commonResource.generateNumbers());
		}
		
		commonResource.releaseLock();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		}
	
}
