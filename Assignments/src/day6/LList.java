package day6;
import java.util.Scanner;

import day6.LinkedListNode;
public class LList<T> implements Methods<T>{
		
	LinkedListNode<T> node;
	
	public static void main(String[] args) {
		
		LList<String> l = new LList<String>();
		LinkedListNode<String> root = null;
		LinkedListNode<String> n = new LinkedListNode<String>();
		n.setInfo("yo");
		root = l.add(n,root);	
		
		LinkedListNode<String> n1 = new LinkedListNode<String>();
		n1.setInfo("yo-yo");
		root = l.add(n1, root);
		
		LinkedListNode<String> n2 = new LinkedListNode<String>();
		n2.setInfo("yo-yo-yo");
		root = l.add(n2, root);
		
		LinkedListNode<String> n3 = new LinkedListNode<String>();
		n3.setInfo("yo-yo-yo-yo");
		root = l.add(n3, root);
		
		
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		String info = sc.nextLine();
		
		LinkedListNode<String> n4 = new LinkedListNode<String>();
		n4.setInfo(info);
				
		//l.remove(root);
		l.change(root,n4,index);
		l.display(root);
		l.size(root);
	}	
	@Override
	public LinkedListNode<T> add(LinkedListNode<T> node,LinkedListNode<T> root ){
		if(root == null)
		{
			root = node;
			root.setNext(null);
			//System.out.println("r"+root.getInfo());
			
		}
		else
		{
			LinkedListNode<T> trav = root;
			
			
			while(trav.getNext() != null)
			{	
				
				trav = trav.getNext();
				
			}
			node.setNext(null);
			trav.setNext(node);
			trav = node;
			

		}
		return root;
	}
	public <T> void remove(LinkedListNode<T> root)
	{
		LinkedListNode<T> trav = root;
		while((trav.getNext()).getNext() != null)
		{
			trav = trav.getNext();
		}
		trav.setNext(null);
	}
	
	public <T> void size(LinkedListNode<T> root)
	{
		int size = 0;
		LinkedListNode<T> trav = root;
		while(trav.getNext() != null)
		{
			trav = trav.getNext();
			size++;
		}
		System.out.println(size+1);
	}
	@Override
	public <T> void change(LinkedListNode<T> root,LinkedListNode<T> n , int index) {
		
		LinkedListNode<T> trav = root;
		for(int i = 0 ; i < index-1 ; i++)
		{
			trav = trav.getNext();
		}
		trav.setInfo(n.getInfo());
//		trav.setNext(n); 
		
	}
	public <T> void display(LinkedListNode<T> root){
		
		LinkedListNode<T> trav = root;
		while(trav.getNext() != null)
		{
			System.out.println(trav.getInfo());
			trav = trav.getNext();

		}
		System.out.println(trav.getInfo());
	}
}
