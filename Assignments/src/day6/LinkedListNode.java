package day6;

public class LinkedListNode<T> {
	private T info;
	private LinkedListNode<T> next;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public LinkedListNode<T> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<T> node) {
		this.next = node;
	}
	
	
	
}
