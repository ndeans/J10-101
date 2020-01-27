package us.deans.javastudy.operations.core10.patterns;

import us.deans.javastudy.support.GreetingService;

public class DiConstructor {

	private GreetingService gService = null;

	
	public DiConstructor(GreetingService gs) {
		this.gService = gs;
	}
	
	public String hello() {
		return gService.getGreeting();
	}

}
