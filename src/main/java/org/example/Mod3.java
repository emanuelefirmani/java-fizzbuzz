package org.example;

public class Mod3 implements ICalculator {
    private ICalculator next;

    public Mod3(ICalculator next) {

        this.next = next;
    }

    @Override
    public String calculate(int value) {
        if(value % 3 == 0)
            return "Fizz";
        return next.calculate(value);
    }
}
