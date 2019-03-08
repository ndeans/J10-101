package support;

public class LogPrinter {

	private static LogPrinter instance = null;
	
	protected LogPrinter() { }
	
	public static LogPrinter getInstance() {
		if (instance == null) {
			instance = new LogPrinter();
		}
		return instance;
	}

	public void printHead(String msg) {
		System.out.println(">>>> Test: " + msg);
		System.out.println();
	}
	
	public void printBreak() {
		System.out.println(); System.out.println();
	}
	
	public void printMsg(String msg) {
		System.out.println("... " + msg);
	}
	
}
