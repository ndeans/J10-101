package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.support.DiConstructor;
import us.deans.javastudy.support.GreetingService;

/**
 * Controller for the DI Operation
 * This class is called from the main application and/or the corresponding junit test and in turn calls the various client classes
 * that handle the dependency on the Greeting service in different ways, including dependency injection.
 * 
 * @author ndeans
 *
 */
public class OpHelloDI extends BaseOperation {

	String greeting = null;
	
	public OpHelloDI() {
		super();
	}
	
	public void start(int opt) {

		GreetingService gs = new GreetingService();
		
		switch (opt) {
		
			case 0:
				// standard
				greeting = gs.getGreeting();
				lp.printMsg("[injection: none] " + greeting);
				break;
			case 1:
				// constructor injection
				DiConstructor dic = new DiConstructor(gs);
				greeting = dic.hello();
				lp.printMsg("[injection: constructor] " + greeting);
				break;
			case 2:
				// setter injection
			case 3:
				// interface injection
				
		}
		


	}
	
	public String getGreeting() {
		return this.greeting;
	}
	
	
}
