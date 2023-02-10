package org.example.chain;

/**
 * 第一部
 *
 * @author wangqingao
 */
public class FoodHandleChainStep2 extends FoodHandleChain {
    @Override
    public void handle() {
        System.out.println("第二步");
        handleWithNext();
    }
}
