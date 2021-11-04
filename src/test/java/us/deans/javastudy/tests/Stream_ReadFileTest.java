package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.core10.Stream_ReadFile;
import us.deans.javastudy.support.LogPrinter;

public class Stream_ReadFileTest {

    LogPrinter lp;

    @Test
    void test() {

        lp.printHead("Stream Read File ...");
        Stream_ReadFile str1 = new Stream_ReadFile();
        str1.start();
        assertTrue(true);

    }
}
