package operations;

public class Fibonacci {

	public Fibonacci() { }
	
	public void sequenceFor(int loop) {
		
		int t1=0, t2=1;
		
		System.out.println("first " + loop + " terms: ");
		
		for (int i=1; i<=loop; i++) {
			
			System.out.print(t1 + " + ");
			
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;		
			
		}
		
	}
	
	public void sequenceWhile(int loop) {
		
		int i = 1, t1=0, t2=1;
		
		while (i <= loop) {
			
			System.out.print(t1 + " + ");
			
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
			i++;
			
		}
		
	}
	
}
