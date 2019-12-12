package us.deans.javastudy.support;

public class DiConstructor {

	private GreetingService gService = null;

	
	public DiConstructor(GreetingService gs) {
		this.gService = gs;
	}
	
	public String hello() {
		return gService.getGreeting();
	}

}
