package org.example.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Observer1 implements Observer{
    @Override
    public void notifyObj() {
        log.info("我是观察者1,收到消息.");
    }
}
