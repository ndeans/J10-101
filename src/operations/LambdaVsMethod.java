package operations;

import java.util.Comparator;
import base.BaseOperation;

public class LambdaVsMethod extends BaseOperation {

	public Comparator<String> strComparator = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};

	public Comparator<String> strComparatorLambda = (String o1, String o2) -> { return o1.compareTo(o2); };

	public void start() {
		
		int x1 = strComparator.compare("hello", "world");
		lp.printMsg("method comparison: " + x1);
		
		int x2 = strComparatorLambda.compare("hello", "world");
		lp.printMsg("lambda comparison: " + x2);
		
	}
	
	
}
