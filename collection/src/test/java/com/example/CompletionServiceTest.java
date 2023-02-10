package com.example;

import java.io.*;
import java.util.concurrent.*;

public class CompletionServiceTest {
    static String a = "0";

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException, ClassNotFoundException {
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

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
        outputStream.writeObject(o2);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));
        Object o1 = objectInputStream.readObject();
        System.out.println("序列化后:"+o1);
        int a = 0;
        System.out.println(a);
    }
}
