package org.example.chain;

public class Test {
    public static void main(String[] args) {
        FoodHandleChain step1 = new FoodHandleChainStep1();
        FoodHandleChain step2 = new FoodHandleChainStep2();
        FoodHandleChain step3 = new FoodHandleChainStep3();

//        step3.setNext(null);
        step2.setNext(step3);
        step1.setNext(step2);

        step1.handle();


    }
}
