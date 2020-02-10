

package us.deans.javastudy.driver;

import java.util.List;
import java.util.Map;

import us.deans.javastudy.operations.core10.*;
import us.deans.javastudy.operations.core10.patterns.DmJdbcTopTenArrayList;
import us.deans.javastudy.operations.core10.patterns.DmJdbcTopTenLinkedList;
import us.deans.javastudy.operations.core10.patterns.DmJdbcTopTenMap;
import us.deans.javastudy.operations.core10.patterns.OpHelloDI;
import us.deans.javastudy.operations.core10.patterns.Singleton;
import us.deans.javastudy.support.LogPrinter;
import us.deans.javastudy.support.WordWrapException;

public class Application {

	LogPrinter lp;
	
	public static void main(String[] args) {

		LogPrinter lp  = LogPrinter.getInstance();
		printBreak();
		
		// variable swap
		lp.printHead("Variable Swap... [DmVarSwap]");
		DmVarSwap vs = new DmVarSwap();
		vs.swap(13, 7);
		printBreak();
		
		// duplicate chars
		lp.printHead("Print Duplicate Characters... [DmDupChars] ");
		DmDupChars dc = new DmDupChars();
		dc.printDupes("vacation");
		printBreak();
		
		// get a Singleton
		lp.printHead("Get Singleton Instance... [Singleton] ");
		Singleton singleton = Singleton.getInstance();
		singleton.printHello();
		printBreak();
		
		// print fibonacci sequence
		lp.printHead("Print Fibonacci Sequence... [DmFibonacci] ");
		DmFibonacci fib = new DmFibonacci();
		fib.sequenceFor(10);
		System.out.println();
		fib.sequenceWhile(10);
		System.out.println();
		printBreak();
		
		// create an ArrayList of Strings representing colors and sort it.
		lp.printHead("Sorting an ArrayList of Strings... [DmSortListSimple]");
		DmSortListSimple slist_b = new DmSortListSimple();
		slist_b.printList();
		lp.printBreak();
		
		System.out.println();
		slist_b.sortList();
		slist_b.printList(); 
		System.out.println();
		slist_b = null;		
		printBreak();

		// create a list of color records and sort by level.
		lp.printHead("Create an ArrayList of custom objects (ColorDef) and sort by Level... [DmSortListComparator]");
		DmSortListComparator slist_c = new DmSortListComparator();
		slist_c.sortListByLevel(); printBreak();
		
		// sort that list of colors
		lp.printHead("Sort the list by Color...");
		slist_c.sortListByColor();
		printBreak();
		
		// now play with Linked Lists
		lp.printHead("Create and populate a LinkedList... [OpLinkedList]");
		OpLinkedList listMgr = new OpLinkedList();
		listMgr.getStatus();
		listMgr = null;
		printBreak();
		
		// now play with HashMaps
		lp.printHead("Create and populate a HashMap... [OpHashMap]");
		OpHashMap hmapMgr = new OpHashMap();
		hmapMgr.start();
		hmapMgr = null;
		printBreak();
		
		// Find Common Names between two String arrays
		lp.printHead("Find common names between two String arrays... [DmCommonStrings]");
		DmCommonStrings cs = new DmCommonStrings();
		cs.start();
		printBreak();
		
		// Check if word is a palindrome
		lp.printHead("Check if word is a palindrome... [DmPalindrome]");
		DmPalindrome c4p = new DmPalindrome();
		c4p.start();
		printBreak();
		
		// binary search tree
		lp.printHead("Binary Tree Check... [DmBinaryTreeCheck]");
		DmBinaryTreeCheck btc = new DmBinaryTreeCheck();
		btc.start();
		printBreak();
		
		// averages
		lp.printHead("Print averages (integers to doubles)... [DmAverages]");
		DmAverages a = new DmAverages();
		a.start();
		printBreak();
		
		// generics
		lp.printHead("Advantages of Generics???  [DmGenericOrNot]");
		DmGenericOrNot gen = new DmGenericOrNot();
		gen.start();
		printBreak();
		
		// parsing XML with STAX (Java Streaming API for XML)
		lp.printHead("Parsing XML with STAX...  [DmParseXMLBreakfastMenu]");
		DmParseXMLBreakfastMenu stax = new DmParseXMLBreakfastMenu();
		stax.start();
		printBreak();
		
		// Check for number in array
		lp.printHead("Check for Integer in Array... [DmFindNumberInArray] ");
		DmFindNumberInArray fnia = new DmFindNumberInArray();
		fnia.start();
		printBreak();
		
		// Write to CSV File
		lp.printHead("Write a map to a CSV file...  [OpCSVWrite]");
		OpCSVWrite writer = new OpCSVWrite();
		writer.start();
		printBreak();
		
		// Read CSV file
		lp.printHead("Read a CVSV file...  [OpCSVRead]");
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
		DmLambdaVsMethod lx = new DmLambdaVsMethod();
		lx.start();
		printBreak();
		
		// Executors
		lp.printHead("Executor Operation...");
		DmExecutorOperation xo = new DmExecutorOperation();
		xo.start(2);
		printBreak();
		
		// Logging API
		lp.printHead("Logging API Operation...");
		DmLoggingAPI lop = new DmLoggingAPI();
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
		
		// Reading Data from Oracle XE 18c
		lp.printHead("Top Ten - Reading Data from Oracle XE 18c - Using Linked List");
		DmJdbcTopTenLinkedList jdbc1 = new DmJdbcTopTenLinkedList();
		List<String> llist1 = jdbc1.getListOfRecords();
		System.out.println();
		lp.printMsg(llist1.toString());
		printBreak();
		
		lp.printHead("Top Ten - Reading Data from Oracle XE 18c - Using Array List");		
		DmJdbcTopTenArrayList jdbc2 = new DmJdbcTopTenArrayList();
		List<String> alist = jdbc2.getListOfRecords();
		System.out.println();
		lp.printMsg(alist.toString());
		printBreak();
		
		lp.printHead("Top Ten - Reading Data from Oracle XE 18c - Using Hash Map");	
		DmJdbcTopTenMap jdbc3 = new DmJdbcTopTenMap();
		Map<Integer, String> hmap = jdbc3.getMapOfRecords();
		System.out.println();
		lp.printMsg(hmap.toString());
		printBreak();		
		
		// Strategy Pattern
		
		
		
		// program complete
		lp.printHead("Testing Complete :)");
		lp.countServed();
		
	}
	
	public static void printBreak() {
		
		LogPrinter lp  = LogPrinter.getInstance();
		lp.printBreak(1);

	}

}
