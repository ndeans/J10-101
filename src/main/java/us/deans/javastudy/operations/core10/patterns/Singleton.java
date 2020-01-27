package us.deans.javastudy.operations.core10.patterns;

public class Singleton {

	private static Singleton instance = null;
	
	protected Singleton(){}
	
	public static Singleton getInstance() {
		
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	public void printHello() {
		
		System.out.println("Hello World! This is the Singleton.");
		
	}
	
}
