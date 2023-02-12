package org.example.factory1;

public class Test {
    public static void main(String[] args) {
        BjPizzaFactory factory = new BjPizzaFactory();
        IFood food = factory.getFood(new BeijingChisePizza());
        IFood load = factory.getFood(new LandonChisePizza());
        IFood load1 = factory.getFood(new LandonPaperPizza());

        LandPizzaFactory factory1  = new LandPizzaFactory();
        IFood food1 = factory1.getFood(new LandonPaperPizza());
        IFood food2 = factory1.getFood(new LandonChisePizza());
    }
}
