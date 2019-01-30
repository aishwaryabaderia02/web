package com.psl.util;
import java.util.Random;
public class CommonResource {
	private int[] numbers;
	private boolean available;
	private Random random;
	public CommonResource() {
		numbers = new int[50];
		available = true;
		random = new Random();
	}
	
	public synchronized void getLock() throws InterruptedException{              //wait method is called inside from sync block
		while(available == false){wait();}
		available = false;
	}
	
	
	public synchronized void releaseLock(){
		available = true;
		notifyAll();
	}
	public int getSize(){
		return numbers.length;
	}
	
	public int generateNumbers(){
		int num;
		do {
			num = random.nextInt();
		}while(num < 0 || num > 0x3e8);
		return num;
	}
	
	public int getNumber(int index)
	{
		return numbers[index];
		}
	
	public void setNumber(int index,int value){
		
		numbers[index] = value;
	}
}
