package org.example.chain;

/**
 * 第一部
 *
 * @author wangqingao
 */
public class FoodHandleChainStep1 extends FoodHandleChain {

    @Override
    public void handle() {
        System.out.println("第一步");
        handleWithNext();
    }
}
