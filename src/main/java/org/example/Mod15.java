package org.example;

public class Mod15 implements ICalculator {

    public String calculate(int value) {
        if(value % 15 == 0)
            return "FizzBuzz";
        return null;
    }
}
