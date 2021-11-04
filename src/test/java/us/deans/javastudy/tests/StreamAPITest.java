package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import us.deans.javastudy.operations.core10.StreamAPI;
import us.deans.javastudy.support.LogPrinter;


class StreamAPITest {

    LogPrinter lp;

    @BeforeEach
    void setUp() throws Exception {
        lp = LogPrinter.getInstance();
    }

    @AfterEach
    void tearDown() throws Exception {
        lp = null;
    }

    @Test
    void test() {

        lp.printHead("Stream API ...");
        StreamAPI str1 = new StreamAPI();
        str1.start();
        assertTrue(true);

    }


}
