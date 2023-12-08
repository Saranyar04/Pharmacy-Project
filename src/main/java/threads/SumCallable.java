package threads;

import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {

    private int i;

    public SumCallable(int i) {
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }
}
