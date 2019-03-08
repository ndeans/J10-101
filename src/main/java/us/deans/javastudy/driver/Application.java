package main;

import operations.*;
import support.LogPrinter;

public class Application {

	public static void main(String[] args) {

		LogPrinter lp  = LogPrinter.getInstance();
		
		// variable swap
		lp.printHead("Variable Swap...");
		VarSwap vs = new VarSwap();
		vs.swap(13, 7);
		lp.printBreak();
		
		// duplicate chars
		lp.printHead("Print Duplicate Characters... ");
		DupChars dc = new DupChars();
		dc.printDupes("vacation");
		lp.printBreak();
		
		// get a Singleton
		lp.printHead("Get Singleton Instance... ");
		Singleton singleton = Singleton.getInstance();
		singleton.printHello();
		printBreak();
		
		// print fibonacci sequence
		lp.printHead("Print Fibonacci Sequence... ");
		Fibonacci fib = new Fibonacci();
		fib.sequenceFor(10);
		System.out.println();
		fib.sequenceWhile(10);
		printBreak();
		
		// create an ArrayList of Strings representing colors and sort it.
		lp.printHead("Create an ArrayList of Strings representing colors and sort by default...");
		SortListSimple slist_b = new SortListSimple();
		slist_b.printList(); printBreak();
		slist_b.sortList();
		slist_b.printList(); printBreak();
		slist_b = null;
		
		// create a list of color records and sort by level.
		lp.printHead("Create an ArrayList of custom objects (ColorDef) and sort by Level...");
		SortListComparator slist_c = new SortListComparator();
		slist_c.sortListByLevel(); printBreak();
		
		// sort that list of 
		lp.printHead("Sort the list by Color...");
		slist_c.sortListByColor();
		printBreak();
		
		// now play with Linked Lists
		lp.printHead("Create and populate a LinkedList...");
		OpLinkedList llist = new OpLinkedList();
		printBreak();
		llist.getStatus();
		llist = null;
		printBreak();
		
		// now play with HashMaps
		lp.printHead("Create and populate a HashMap...");
		OpHashMap hmap = new OpHashMap();
		
		printBreak();
		
		// Find Common Names between two String arrays
		lp.printHead("Find common names between two String arrays...");
		CommonStrings cs = new CommonStrings();
		cs.start();
		printBreak();
		
		// Check if word is a palindrome
		lp.printHead("Check if word is a palindrome...");
		Palindrome c4p = new Palindrome();
		c4p.start();
		printBreak();
		
		// binary search tree
		lp.printHead("Binary Tree Check...");
		BinaryTreeCheck btc = new BinaryTreeCheck();
		btc.start();
		printBreak();
		
		// averages
		lp.printHead("Print averages (integers to doubles)...");
		Averages a = new Averages();
		a.start();
		printBreak();
		
		// generics
		lp.printHead("Advantages of Generics???");
		GenericOrNot gen = new GenericOrNot();
		gen.start();
		printBreak();
		
		// parsing XML with STAX (Java Streaming API for XML)
		lp.printHead("Parsing XML with STAX...");
		ParseXMLBreakfastMenu stax = new ParseXMLBreakfastMenu();
		stax.start();
		printBreak();
		
		// Check for number in array
		lp.printHead("Check for Integer in Array");
		FindNumberInArray fnia = new FindNumberInArray();
		fnia.start();
		printBreak();
		
		// HashMap CRUD
		lp.printHead("HashMap CRUD");
		// CrudMap map = new CrudMap();
		printBreak();


		// depth first
		printBreak();

		
		// Lambda Expressions
		lp.printHead("Lambda Expression...");
		LambdaVsMethod lx = new LambdaVsMethod();
		lx.start();
		printBreak();

		
		// program complete
		lp.printHead("Testing Complete :)");
		
	}
	
	private static void printBreak() {
		System.out.println(); System.out.println();
	}

	

}
