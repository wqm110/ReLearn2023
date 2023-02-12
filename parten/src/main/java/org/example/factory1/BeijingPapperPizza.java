package org.example.factory1;

import lombok.extern.slf4j.Slf4j;

/**
 * 北京胡椒披萨
 *
 * @author wqm
 */
@Slf4j
public class BeijingPapperPizza extends Pizza implements IPepper, Beijing {

    @Override
    public String getType() {
        return getLocation() + getFlavor();
    }

    @Override
    IFood getFood() {
        return this;
    }

    @Override
    void prepare() {
        log.info("准备..."+this.getLocation()+this.getFlavor()+getType());
    }

    @Override
    void cock() {

    }

    @Override
    BeijingChisePizza delive() {
        prepare();
        cock();
        BeijingChisePizza beijingChisePizza = new BeijingChisePizza();
        return beijingChisePizza;
    }
}
