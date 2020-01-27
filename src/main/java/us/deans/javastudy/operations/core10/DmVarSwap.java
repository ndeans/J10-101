package us.deans.javastudy.operations.core10;

public class DmVarSwap {

	public DmVarSwap() {
	
	}
	
	public void swap(int a, int b) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = a - b;
		b = b + a;
		a = b - a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
}
