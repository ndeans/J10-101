/*
 * Hint: tail the customer.csv file while running the operation in a tail 
 */
package us.deans.javastudy.tests;

import org.junit.jupiter.api.Test;
import us.deans.javastudy.operations.core10.OpCSVWrite;

class OpCSVWriteTest {

	@Test
	void test() {
		
		OpCSVWrite writer = new OpCSVWrite();
		writer.start();
		
	}

}
