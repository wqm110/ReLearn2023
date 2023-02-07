package com.example;

import java.util.concurrent.*;

public class CompletionServiceTest {
    static String a = "0";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = new ThreadPoolExecutor(5, 11,
                20, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50), r -> {
            Thread thread = new Thread(r);
            thread.setName("后台线程_" + thread.threadId());
            return thread;
        });
        ArrayBlockingQueue<Object> objects = new ArrayBlockingQueue<>(20);

        CompletionService completionService = new ExecutorCompletionService(executor, objects);
        completionService.submit(() -> {
            a += "_";
            return a;
        });
        completionService.submit(() -> {
            a += "+";
            return a;
        });

        Object o = completionService.take().get();
        System.out.println(o);

        Object o2 = completionService.take().get();
        System.out.println(o2);

    }
}
