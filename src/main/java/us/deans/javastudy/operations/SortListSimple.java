package us.deans.javastudy.operations;

import java.util.ArrayList;
import java.util.Collections;

public class SortListSimple {

	ArrayList<String> alist;
	
	public SortListSimple() { 
		
		alist = new ArrayList<String>();
	
		alist.add("red");
		alist.add("green");
		alist.add("blue");
		
	
	}
	
	public void sortList() {
		Collections.sort(alist);		
	}

	public void printList() {
		
		System.out.printf("%s", alist.get(0));
		
		for (int i=1; i < alist.size(); i++) {
			System.out.printf(" - %s", alist.get(i) );
		}	
	
	}	
	
}
