package operations;

import base.BaseOperation;

public class Averages extends BaseOperation {

    public static double average(int a, int b) {
        int sum = a + b;
        double avg = (double)sum / 2;
    	return avg;
    }

    public void start() {
    	System.out.println(average(2,1));
    }
    
}
