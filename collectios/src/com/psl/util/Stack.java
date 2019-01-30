package com.psl.util;

public class Stack<T> { // T == Generic type
	private int top, size;
	private T data[];

	public Stack(int Size) {
		this.size = size;
		// data = new String[size];
	}

	public void push(T value) {

	}

	public T pop() {
		return null;
	}

	public T peek(){
		return null;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}
	
}
