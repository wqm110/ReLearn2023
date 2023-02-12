package org.example.factory1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 *
 * @author wqm
 */
public class BjPizzaFactory extends AbsFoodFactory {
    @Override
    IFood getFood(Pizza pizza) {
        if (!(pizza instanceof Beijing)) {
            log.error("超出配送范围");
            return null;
        }
        return super.getFood(pizza);
    }
}
