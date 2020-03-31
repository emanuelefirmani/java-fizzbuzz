package org.example;

public class Chain implements ICalculator {
    ICalculator chain;

    public Chain() {
        chain = new Mod15(new Mod5(new Mod3(new Mod1())));
    }

    @Override
    public String calculate(int value) {
        return chain.calculate(value);
    }
}
