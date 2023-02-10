package org.example.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * 第一部
 *
 * @author wangqingao
 */
@Slf4j
public class FoodHandleChainStep3 extends FoodHandleChain {
    @Override
    public IResource handle(IResource resource) {
        log.info("第三步=>改刀");
        log.debug(".........");
        resource.doChain();
        return handleWithNext(resource.setName(resource.getName()+"_three_"));
    }
}
