package us.deans.javastudy.support;

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
