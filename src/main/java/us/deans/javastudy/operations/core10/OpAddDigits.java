package us.deans.javastudy.operations.core10;

import java.util.ArrayList;

import us.deans.javastudy.base.BaseOperation;

public class OpAddDigits extends BaseOperation {

	
	public OpAddDigits() {
		
	}
	
	public int add(int p) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		Integer x=p;
		Integer y=0, s=0;

		while (x > 10) {
			
			y = x % 10;
			x = x / 10;
			a.add(y);
			
		}
		a.add(x);
		
		int len = a.size();
		
		for (int i=0; i<len; i++) {
			s = s + a.get(i);
		}
		
		return s;
	}
	
}
