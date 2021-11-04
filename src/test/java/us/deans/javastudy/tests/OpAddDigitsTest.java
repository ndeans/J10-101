package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import us.deans.javastudy.base.BaseTest;
import us.deans.javastudy.operations.core10.OpAddDigits;
import us.deans.javastudy.support.LogPrinter;

public class OpAddDigitsTest extends BaseTest {

    @Test
    public void testAddDigits() {

        lp = LogPrinter.getInstance();
        lp.printHead("Add digits of input number...");

        OpAddDigits op = new OpAddDigits();
        int x = op.add(12345);
        assertEquals(15, x);

    }

}
