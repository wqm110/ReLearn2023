package org.example.factory1;


import lombok.extern.slf4j.Slf4j;

/**
 * 北京胡椒披萨
 *
 * @author wqm
 */
@Slf4j
public class BeijingChisePizza extends Pizza implements IChise, Beijing {


    @Override
    IFood getFood() {
        BeijingChisePizza pizza = new BeijingChisePizza();
        pizza.prepare();
        pizza.cock();
        return pizza.delive();
    }

    @Override
    void prepare() {
        log.info("准备..."+this.getLocation()+this.getFlavor()+getType());
    }

    @Override
    void cock() {
        log.info("烹饪");
    }

    @Override
    BeijingChisePizza delive() {
        log.info("运输..");
        return this;
    }
}
