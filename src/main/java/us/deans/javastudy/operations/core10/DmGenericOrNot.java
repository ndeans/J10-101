package us.deans.javastudy.operations.core10;

import java.util.ArrayList;
import java.util.List;

import us.deans.javastudy.base.BaseOperation;

/**
 * I still don't get it. Sure, I don't have to cast if I use generics (line 22) but what does that actually buy me if I 
 * still have to specify generic parameters? (line 25)
 * 
 * @author ndeans
 *
 */

public class DmGenericOrNot extends BaseOperation {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void start() {
		
		// without generics you need to cast... (String)

		List list1 = new ArrayList();						// no generic parameters
		list1.add("hello");
		String str1 = (String) list1.get(0);                // but you have to cast
		
		lp.printMsg("without generics ... " + str1);
		
		
		// without generics you need to cast... (String)

		List<String> list2 = new ArrayList<String>();		// no generic parameters
		list2.add("hello");
		String str2 = (String) list2.get(0);                // but you have to cast
		
		lp.printMsg("with generics ... " + str2);
		
	}
	
}

