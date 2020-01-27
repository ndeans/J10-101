package us.deans.javastudy.operations.core10.patterns;

import us.deans.javastudy.support.GreetingService;

public class DiInterface implements ServiceSetter {

	private GreetingService gService;
	
	@Override
	public void setService(GreetingService service) {
		this.gService = service;
		
	}
	
	public String hello() {
		return gService.getGreeting();
	}
	
}
