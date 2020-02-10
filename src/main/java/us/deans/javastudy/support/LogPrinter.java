package us.deans.javastudy.support;

public class LogPrinter {

	private static LogPrinter instance = null;
	private static int served = 0;
	
	private LogPrinter() {
		System.out.println("!!! instantiating the LogPrinter !!!");
	}
	
	public static LogPrinter getInstance() {
		if (instance == null) {
			instance = new LogPrinter();
		}
		served++;
		System.out.println("~~~ returning reference to the LogPrinter instance : " + served  + " ~~~");
		return instance;
	}

	public void printHead(String msg) {
		System.out.println(">>>> Test: " + msg);
		System.out.println();
	}
	
	public void printBreak() {
		System.out.println(); 
		System.out.println();
	}
	
	public void printBreak(int opt) {
		String line = "------------------------------------------------------------------------------------";
		System.out.println(line); 
		System.out.println();
	}
	
	public void printMsg(String msg) {
		System.out.println(".. " + msg);
	}
	
	public void countServed() {
		System.out.println(".. " + served + " LogPrinter served");
	}
	
}
