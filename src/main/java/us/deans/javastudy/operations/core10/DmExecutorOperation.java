/*
 *  More or less taken from https://www.baeldung.com/java-executor-service-tutorial
 */
package us.deans.javastudy.operations.core10;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import us.deans.javastudy.base.BaseOperation;

public class DmExecutorOperation extends BaseOperation {

    ExecutorService executor;

    @Override
    public void start(int opt) {

        // instantiate executor
        switch (opt) {
            case 1:
                // using factory method of the Executors class
                executor = Executors.newFixedThreadPool(10);
                break;
            default:
                // using direct assignment
                executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        }

        Runnable runnableTask = () -> {
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's Execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();

        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);


        // terminate
        executor.shutdown();

    }

}
