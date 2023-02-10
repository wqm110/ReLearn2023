package org.example.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * 第四步
 *
 * @author wangqingao
 */
@Slf4j
public class FoodHandleChainStep4 extends FoodHandleChain {
    @Override
    public void handle() {
        log.info("第四步=>爆炒,出锅");
        log.debug(".........");
        handleWithNext();
    }
}
