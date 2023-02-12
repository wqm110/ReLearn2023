package org.example.singleton;

import java.util.concurrent.*;

/**
 * 枚举单例
 *
 * @author wqm
 */
public enum SingletonEnum {
    /**
     * 简单实用案例
     */
    FIVE( new ThreadPoolExecutor(5, 11, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(30), r -> {
        Thread thread = new Thread(r);
        thread.setName("单例线程树池-" + thread.threadId());
        return thread;
    })),
    /**
     * 简单实用案例
     */
    SIX( new ThreadPoolExecutor(6, 11, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(30), r -> {
        Thread thread = new Thread(r);
        thread.setName("单例线程树池2-" + thread.threadId());
        return thread;
    }));
    private final Executor executor;



    public Executor getExecutor() {
        return executor;
    }


    SingletonEnum( Executor executor) {
        this.executor = executor;
    }

}
