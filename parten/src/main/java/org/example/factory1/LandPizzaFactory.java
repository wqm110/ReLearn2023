package org.example.factory1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 *
 * @author wqm
 */
public class LandPizzaFactory extends AbsFoodFactory {
    @Override
    IFood getFood(Pizza pizza) {
        if (!(pizza instanceof Landon)) {
            log.error("超出配送范围");
            return null;
        }
        return super.getFood(pizza);
    }
}
