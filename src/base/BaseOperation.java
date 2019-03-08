package base;

import support.LogPrinter;

public class BaseOperation {
	
	protected LogPrinter lp;				// protected so child classes can access.
	
	public BaseOperation() {
		lp = LogPrinter.getInstance();
	}
	
	public void start() {
		
	}

	public void end() {

	}
	
}
