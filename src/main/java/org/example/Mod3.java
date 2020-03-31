package org.example;

public class Mod3 implements ICalculator {
    private ICalculator nextChain;

    public Mod3(ICalculator nextChain) {

        this.nextChain = nextChain;
    }

    @Override
    public String calculate(int value) {
        if(value % 3 == 0)
            return "Fizz";
        return nextChain.calculate(value);
    }
}
