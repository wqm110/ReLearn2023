package org.example.factory1;

/**
 * @author wqm
 */
public class AbsFoodFactory {
    IFood food;

    IFood getFood(Pizza pizza) {
        food = pizza.getFood();
        return food;
    }
}
