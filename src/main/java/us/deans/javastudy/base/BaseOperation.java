package us.deans.javastudy.base;

import us.deans.javastudy.support.LogPrinter;

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
