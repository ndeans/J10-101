package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.support.LogPrinter;

public class OpRaisePower extends BaseOperation {

    static LogPrinter LP = LogPrinter.getInstance();

    public OpRaisePower() {
    }

    public Integer raisePower(Integer x, Integer y) {

        int z = x;

        for (int i = 1; i < y; i++) {

            z = z * x;
            LP.printMsg("x = " + x + ", y = " + y + ", z = " + z);
        }

        return z;
    }


}
