package org.example;

public class Mod5 implements ICalculator {
    @Override
    public String calculate(int value) {
        if(value % 5 == 0)
            return "Buzz";
        return null;
    }
}
