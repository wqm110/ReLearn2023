package org.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author wangqingao
 */
public class PublisableEvent implements Event {

    public List<Observer> observers;

    public PublisableEvent() {
        init();
    }

    void init() {
        if (Objects.isNull(observers)) {
            this.observers = new ArrayList<>();
        }
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
