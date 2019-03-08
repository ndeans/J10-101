package us.deans.javastudy.support;

import java.util.Arrays;

public class ArrayGenerator {

	
	public int[] genIntArray() {
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		return arr;
		
	}
	
	public Integer[] genIntegerArray() {
		
		Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
		return arr;
		
/*
		arr[0] = Integer.valueOf(1);
		arr[1] = Integer.valueOf(2);
		arr[2] = Integer.valueOf(3);
		arr[3] = Integer.valueOf(4);
		arr[4] = Integer.valueOf(5);	
*/		
		
	}
	
	public String[] genStringArray() {
		
		String[] arr = new String[] {"every","good","boy","does","fine"};
		return arr;
		
	}
	
	public String printIntegerArray(Integer[] arr) {
		
		return Arrays.toString(arr);
		
	}
	
}
