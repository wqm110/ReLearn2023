package org.example.factory1;

import lombok.extern.slf4j.Slf4j;

/**
 * 北京胡椒披萨
 *
 * @author wqm
 */
@Slf4j
public class LandonPaperPizza extends Pizza implements IPepger, Landon {

    @Override
    IFood getFood() {
        return  delive();
    }

    @Override
    void prepare() {
        log.info("准备..." + this.getLocation() + this.getFlavor() + getType());
    }

    @Override
    void cock() {
    log.info("烹饪...");
    }

    @Override
    LandonPaperPizza delive() {
        prepare();
        cock();
        log.info("运输中...");
        return this;
    }
}
