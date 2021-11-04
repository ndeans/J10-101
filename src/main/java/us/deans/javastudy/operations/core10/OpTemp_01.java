package us.deans.javastudy.operations.core10;

public class OpTemp_01 {

    public OpTemp_01() {
    }

    public void start() {
        int x = 1;
        for (int i = 0; i < 3; i++) {
            x = x + 5 * i;
        }
        System.out.println(x);

    }
}
