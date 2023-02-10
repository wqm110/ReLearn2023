package org.example.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangqingao
 */
@Slf4j
public class Observer2 implements Observer {
    @Override
    public void notifyObj() {
        log.info("我是观察者2,收到消息.");
    }
}
