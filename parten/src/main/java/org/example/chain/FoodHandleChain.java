package org.example.chain;

import lombok.NonNull;

/**
 * 实物处理
 *
 * @author wangqingao
 */
public abstract class FoodHandleChain implements IHandleChain {
    public IHandleChain next;

    @Override
    public IHandleChain getNext() {
        return next;
    }


    @Override
    public void setNext(@NonNull IHandleChain handler) {
        this.next = handler;
    }

    public void handleWithNext() {
        if (null != getNext()) {
            getNext().handle();
        }
    }
}
