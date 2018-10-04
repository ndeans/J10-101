package operations;

import java.util.ArrayList;
import java.util.List;

import base.BaseOperation;

/**
 * I still don't get it. Sure, I don't have to cast if I use generics (line 22) but what does that actually buy me if I 
 * still have to specify generic parameters? (line 25)
 * 
 * @author ndeans
 *
 */

public class GenericOrNot extends BaseOperation {

	public void start() {
		
		// without generics you need to cast... (String)
		List list1 = new ArrayList();						// no generic parameters
		list1.add("hello");
		String str1 = (String) list1.get(0);
		
		// with generics you don't need to cast
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		String str2 = list2.get(0);							//  no cast
		
	}
	
	
}
