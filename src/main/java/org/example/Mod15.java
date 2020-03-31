package org.example;

public class Mod15 implements ICalculator {
    private ICalculator next;

    public Mod15(ICalculator next) {

        this.next = next;
    }

    public String calculate(int value) {
        if(value % 15 == 0)
            return "FizzBuzz";
        return next.calculate(value);
    }
}
