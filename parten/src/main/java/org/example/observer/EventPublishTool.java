package org.example.observer;

import java.util.List;

/**
 * @author wangqingao
 */
public class EventPublishTool {
    public static void publish(Event event) {
        List<Observer> observers = event.getObservers();
        observers.forEach(Observer::notifyObj);
    }
}
