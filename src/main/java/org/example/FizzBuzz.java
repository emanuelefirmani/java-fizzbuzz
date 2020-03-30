package org.example;

public class FizzBuzz {
    public String calculate(int value) {
        if(value % 3 == 0)
            return "Fizz";
        return "Buzz";
    }
}
