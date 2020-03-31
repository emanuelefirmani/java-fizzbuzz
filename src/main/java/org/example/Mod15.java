package org.example;

public class Mod15 implements ICalculator {
    private ICalculator mockedChain;

    public Mod15(ICalculator mockedChain) {

        this.mockedChain = mockedChain;
    }

    public String calculate(int value) {
        if(value % 15 == 0)
            return "FizzBuzz";
        return mockedChain.calculate(value);
    }
}
