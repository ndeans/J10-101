package us.deans.javastudy.driver;

import us.deans.javastudy.operations.core10.*;
import us.deans.javastudy.operations.core10.patterns.DiConstructor;
import us.deans.javastudy.operations.core10.patterns.OpHelloDI;
import us.deans.javastudy.operations.core10.patterns.Singleton;
import us.deans.javastudy.support.GreetingService;
import us.deans.javastudy.support.LogPrinter;
import us.deans.javastudy.support.WordWrapException;

public class Application {

	LogPrinter lp;
	
	public static void main(String[] args) {

		LogPrinter lp  = LogPrinter.getInstance();
		printBreak();
		
		// variable swap
		lp.printHead("Variable Swap...");
		VarSwap vs = new VarSwap();
		vs.swap(13, 7);
		printBreak();
		
		// duplicate chars
		lp.printHead("Print Duplicate Characters... ");
		DupChars dc = new DupChars();
		dc.printDupes("vacation");
		printBreak();
		
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
		System.out.println();
		printBreak();
		
		// create an ArrayList of Strings representing colors and sort it.
		lp.printHead("Sorting an ArrayList of Strings...");
		SortListSimple slist_b = new SortListSimple();
		slist_b.printList(); 
		System.out.println();
		slist_b.sortList();
		slist_b.printList(); 
		System.out.println();
		slist_b = null;		
		printBreak();

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
		llist.getStatus();
		llist = null;
		printBreak();
		
		// now play with HashMaps
		lp.printHead("Create and populate a HashMap...");
		OpHashMap hmap = new OpHashMap();
		hmap.start();
		hmap = null;
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
		
		// Write to CSV File
		lp.printHead("Write a map to a CSV file...");
		OpCSVWrite writer = new OpCSVWrite();
		writer.start();
		printBreak();
		
		// Read CSV file
		lp.printHead("Read a CVSV file...");
		OpCSVRead reader = new OpCSVRead();
		reader.start();
		printBreak();
		
		// HashMap CRUD
		lp.printHead("HashMap CRUD");
		// CrudMap map = new CrudMap();
		printBreak();

		// depth first
		lp.printHead("Depth First");
		// developing this on the other IDE
		printBreak();

		// Lambda Expressions
		lp.printHead("Lambda Expression...");
		LambdaVsMethod lx = new LambdaVsMethod();
		lx.start();
		printBreak();
		
		// Executors
		lp.printHead("Executor Operation...");
		ExecutorOperation xo = new ExecutorOperation();
		xo.start(2);
		printBreak();
		
		// Logging API
		lp.printHead("Logging API Operation...");
		LoggingAPI lop = new LoggingAPI();
		lop.start();
		printBreak();

		// Stream API
		lp.printHead("Stream API (Java 8)...");
		StreamAPI str1 = new StreamAPI();
		str1.start();
		printBreak();
				
		// Wordwrap problem
		lp.printHead("WordWrap...");
		OpWordWrap ww = new OpWordWrap();
		String text1 = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
		try {
			ww.under13(text1);
		} catch (WordWrapException e) {
			e.printStackTrace();
		}
		printBreak();
		
		// Raise To Power Of
		lp.printHead("Raise to Power Of... (Comcast WB)");
		OpRaisePower p = new OpRaisePower();
		p.raisePower(2, 3);
		printBreak();
		
		
		// Dependency Injection: Java/Constructor
		lp.printHead("Dependency Injection: Java/Constructor...");
		OpHelloDI op = new OpHelloDI();
		op.start(1);
		String greeting = op.getGreeting();
		lp.printMsg(greeting);
		printBreak();
		
		
		// Dependency Injection: Java/Setter Method
		lp.printHead("Dependency Injection: Java/Setter Method...");
		op.start(2);
		greeting = op.getGreeting();
		lp.printMsg(greeting);
		printBreak();

		// Adding the digits of a number
		lp.printHead("Adding the digits of 12,345 (Xybion WB)");
		OpAddDigits ad = new OpAddDigits();
		int s = ad.add(12345);
		lp.printMsg("sum of digits = " + s);
		printBreak();
		
		
		// program complete
		lp.printHead("Testing Complete :)");
		
	}
	
	public static void printBreak() {
		
		LogPrinter lp  = LogPrinter.getInstance();
		lp.printBreak(1);

	}

}
