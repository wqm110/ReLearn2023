package org.example.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wqm
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Executor executor = SingletonEnum.FIVE.getExecutor();
//        int times = 0;
//        for (AtomicInteger a = new AtomicInteger(); a.get() < 10000; a.getAndIncrement()) {
//            executor.execute(() -> {
//                a.addAndGet(1);
//            });
//            times++;
//            Thread.sleep(300);
//            log.info("a={},次数={}", a.get(), times);
//        }
        Executor executor1 = SingletonEnum.FIVE.getExecutor();

        log.info(" 是否同意对象:{}", executor.equals(executor1));
    }
}
