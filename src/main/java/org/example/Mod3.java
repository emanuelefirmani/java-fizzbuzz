package org.example;

public class Mod3 implements ICalculator {
    @Override
    public String calculate(int value) {
        if(value % 3 == 0)
            return "Fizz";
        return null;
    }
}
