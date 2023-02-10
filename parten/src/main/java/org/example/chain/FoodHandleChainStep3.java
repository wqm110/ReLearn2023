package org.example.chain;

/**
 * 第一部
 *
 * @author wangqingao
 */
public class FoodHandleChainStep3 extends FoodHandleChain {
    @Override
    public void handle() {
        System.out.println("第三步");
        handleWithNext();
    }
}
