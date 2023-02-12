package org.example.singleton;

import java.util.concurrent.*;

/**
 * 枚举单例
 *
 * @author wqm
 */
public enum SingletonEnum1 {
    /**
     * 简单实用案例
     */
    INSTANCE;
    private ThreadPoolExecutor executor;

    public Executor getInstance() {
        return executor;
    }

    /**
     * 返回值直接执行
     */
    /**
     * 无返回值直接执行
     */
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    /**
     * 返回值直接执行
     */
    public <T> Future<T> submit(Callable<T> callable) {
        return this.executor.submit(callable);
    }


    SingletonEnum1() {
        //最大链接数
        int maxSize = 30;
        /*
         * 核心数
         */
        int CPU_COUNT = Runtime.getRuntime().availableProcessors();

        //核心线程数 = CPU核心数 + 1
        int CORE_POOL_SIZE = CPU_COUNT + 1;

        //线程池最大线程数 = CPU核心数 * 2 + 1
        int MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;

        //非核心线程闲置时超时1s
        int KEEP_ALIVE = 1;

        executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(maxSize), r -> {
            Thread t = new Thread(r);
            t.setName("单例线程池2" + t.threadId());
            return t;
        });


    }

}
