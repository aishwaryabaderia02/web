/*
 * Synchronization in threads is important for sharing resources
 * shared resources will be used by one thread at a time
 */
package com.psl.util;

public class SharedResource {
	
	private long cycles;

	public SharedResource(long cycles) {
		this.cycles = cycles;
	}
	
	public void startCycles(){
		while(--cycles > 0);
	}
	
	public long readCurrentValue()
	{
		return cycles;
	}
}
