package com.example.riven_chris;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by riven_chris on 15/8/14.
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for (Future<String> result : results) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                System.out.println(result.get());
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}

class TaskWithResult implements Callable<String> {

    private int id = 0;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }
}
