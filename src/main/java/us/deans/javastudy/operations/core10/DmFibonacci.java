package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;

public class DmFibonacci extends BaseOperation {

    public DmFibonacci() {
    }

    public void sequenceFor(int loop) {

        int t1 = 0, t2 = 1;

        // System.out.println("first " + loop + " terms: ");
        lp.printMsg("first " + loop + " terms: ");

        for (int i = 1; i <= loop; i++) {

            lp.printMsg(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }

    }

    public void sequenceWhile(int loop) {

        int i = 1, t1 = 0, t2 = 1;

        while (i <= loop) {

            lp.printMsg(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;

        }

    }

}
