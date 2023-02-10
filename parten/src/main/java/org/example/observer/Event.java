package org.example.observer;

import java.util.List;

/**
 * 触发事件
 *
 * @author wangqingao
 */
public interface Event {

    /**
     * 获取观察者列表
     *
     * @return List 观察者列表
     */
    List<Observer> getObservers();

    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 添加观察者
     *
     * @param observer
     */
    void delObserver(Observer observer);

    /**
     * 通知
     */
    void notifyObserver();
}
