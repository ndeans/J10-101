package us.deans.javastudy.support;

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
