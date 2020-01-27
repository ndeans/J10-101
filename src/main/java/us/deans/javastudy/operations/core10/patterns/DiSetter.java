package us.deans.javastudy.operations.core10.patterns;

import us.deans.javastudy.support.GreetingService;

public class DiSetter {

	private GreetingService gService = null;
	
	public DiSetter(){}

	public void setService(GreetingService service) {
		this.gService = service;
	}
	
	public String hello() {
		return gService.getGreeting();
	}
	
}
