package org.example.chain;

import lombok.NonNull;
import lombok.experimental.Accessors;

/**
 * 实物处理
 *
 * @author wangqingao
 */
@Accessors(chain = true)
public abstract class FoodHandleChain implements IHandleChain {

    public IHandleChain next;

    @Override
    public IHandleChain getNext() {
        return next;
    }


    @Override
    public IHandleChain setNext(@NonNull IHandleChain handler) {
        this.next = handler;
        return this;
    }

    public IResource handleWithNext(IResource resource) {
        if (null != getNext()) {
            return getNext().handle(resource);
        }
        return resource;
    }
}
