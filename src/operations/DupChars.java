package operations;

import base.BaseOperation;

public class DupChars extends BaseOperation {

	public DupChars() {
	}
	
	
	public void printDupes( String str ) {
		
		int count[] = new int[256];
		
		for (int i=0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for (int i = 0; i < 256; i++) {
			if (count[i] > 1) {
				System.out.printf("%c, count = %d \n", i, count[i]);
				
			}
		}
		
	}

}
