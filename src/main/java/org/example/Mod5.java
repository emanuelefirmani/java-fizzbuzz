package org.example;

public class Mod5 implements ICalculator {
    private ICalculator next;

    public Mod5(ICalculator next) {
        this.next = next;
    }

    @Override
    public String calculate(int value) {
        if(value % 5 == 0)
            return "Buzz";
        return next.calculate(value);
    }
}
