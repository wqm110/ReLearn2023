package org.example.chain;

/**
 * 责任链测试
 *
 * @author wangqingao
 */
public class Test {
    public static void main(String[] args) {
        FoodHandleChain step1 = new FoodHandleChainStep1();
        step1.setNext(new FoodHandleChainStep2().setNext(new FoodHandleChainStep3().setNext(new FoodHandleChainStep4())));
        step1.handle();
    }
}
