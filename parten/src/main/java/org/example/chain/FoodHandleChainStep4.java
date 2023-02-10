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
    public IResource handle(IResource resource) {
        log.info("第四步=>爆炒,出锅");
        log.debug(".........");
        resource.doChain();
        return handleWithNext(resource.setName(resource.getName() + "_four_"));
    }
}
