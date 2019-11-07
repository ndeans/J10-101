package us.deans.javastudy.support;

public class WordWrapException extends Exception {
	
	private static final long serialVersionUID = 1L;
	String msg;
	
	public WordWrapException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return("WordWrapException: " + msg);
	}
}
