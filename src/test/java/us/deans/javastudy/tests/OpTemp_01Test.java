package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.core10.OpTemp_01;
import us.deans.javastudy.support.LogPrinter;

public class OpTemp_01Test {

    static LogPrinter LP = LogPrinter.getInstance();

    @Test
    public void test() {

        LP.printHead("Temp Test...");
        OpTemp_01 test = new OpTemp_01();
        test.start();
        test = null;
        LP.printBreak();
        assertTrue(true);
    }

}
