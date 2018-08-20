package operations;

import java.util.LinkedList;
import java.util.Iterator;


public class OpLinkedList {

	LinkedList<String> list;
	
	public OpLinkedList() {
		
		// create new LinkedList
		list = new LinkedList<String>();
		
		// add elements to the end
		list.add("red");
		list.add("green");
		list.add("blue");
		
		iterate();
		
	}
	
	public void iterate() {
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	public void getStatus() {
		
		System.out.println("size of linked list: " + list.size());
		System.out.println("is linked list empty? " + list.isEmpty());
		System.out.println("does linked list contain 'blue'? " + list.contains("blue"));
		
		
	}
	
	
}
