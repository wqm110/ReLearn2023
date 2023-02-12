package org.example.factory1;


import lombok.extern.slf4j.Slf4j;

/**
 * 北京胡椒披萨
 *
 * @author wqm
 */
@Slf4j
public class LandonChisePizza extends Pizza implements IChise, Landon {

    @Override
    public String getType() {
        return getLocation() + getFlavor();
    }

    @Override
    IFood getFood() {
        LandonChisePizza pizza = new LandonChisePizza();
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
    LandonChisePizza delive() {
        log.info("运输..");
        return this;
    }
}
