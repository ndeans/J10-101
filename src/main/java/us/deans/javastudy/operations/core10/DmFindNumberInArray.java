package us.deans.javastudy.operations.core10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import us.deans.javastudy.support.ArrayGenerator;

public class DmFindNumberInArray {

	
	public void start() {

		// generate and print an array
		ArrayGenerator dg = new ArrayGenerator();
		Integer[] arr = dg.genIntegerArray();
		System.out.println("Array = " + dg.printIntegerArray(arr));
		
		System.out.println("Using list, does the array contain 3? " + findNumberInList(Arrays.asList(arr), 3));
		System.out.println("Using list, does the array contain 7? " + findNumberInList(Arrays.asList(arr), 7));
		
		System.out.println("Using set, does the array contain 3? " + findNumberInSet(Arrays.asList(arr), 3));
		System.out.println("Using set, does the array contain 7? " + findNumberInSet(Arrays.asList(arr), 7));
		
		System.out.println("Using simple loop, does the array contain 3? " + findNumberUsingLoop(arr, 3));
		System.out.println("Using simple loop, does the array contain 7? " + findNumberUsingLoop(arr, 7));
		
	}
	
    // Complete the findNumber function below.
    private String findNumberInList(List<Integer> arr, Integer k) {
    	
    	String result = "NO";
    	
    	if (arr.contains(k)) {
    		result = "YES";
    	}
    	
    	return result;
        
    }
    
    private String findNumberInSet(List<Integer> arr, Integer k) {
    	
    	String result = "NO";
    	
    	Set<Integer> set = new HashSet<Integer>(arr);
    	if (set.contains(k)) {
    		result = "YES";
    	}
    	
    	return result;
    }
    
    private String findNumberUsingLoop(Integer[] arr, Integer k) {
    	
    	String result = "NO";
    	
    	for (Integer i: arr) {
    		if (i.equals(k)) result = "YES";
    	}
    	
    	return result;
    }
	
}
