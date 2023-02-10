package org.example.observer;

/**
 * @author wangqingao
 */
public class Test {
    public static void main(String[] args) {
        ContractUpdateEvent event = new ContractUpdateEvent();
        Observer2 obj = new Observer2();
        event.addObserver(obj);
        Observer1 ob = new Observer1();
        event.addObserver(ob);


        EventPublishTool.publish(event);
    }
}
