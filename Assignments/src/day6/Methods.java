package day6;

public interface Methods<T> {
	public LinkedListNode<T> add(LinkedListNode<T> node,LinkedListNode<T> root );
	
	public <T> void remove(LinkedListNode<T> root);
	
	public <T> void change(LinkedListNode<T> root, LinkedListNode<T> n, int index);
	
	public <T> void size(LinkedListNode<T> root);
	
	public <T> void display(LinkedListNode<T> root);
}
