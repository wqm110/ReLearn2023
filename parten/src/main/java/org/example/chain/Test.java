package org.example.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * 责任链测试
 *
 * @author wangqingao
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        FoodHandleChain step1 = new FoodHandleChainStep1();
        step1.setNext(new FoodHandleChainStep2().setNext(new FoodHandleChainStep3().setNext(new FoodHandleChainStep4())));
        Radish radish = new Radish();
        step1.handle(radish.setName("0"));
        log.info(radish.getName());
    }
}
