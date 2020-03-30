package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i = 1; i <= 20; i++) {
            System.out.println(fb.calculate(i));
        }
    }

    public String calculate(int value) {
        if(value % 15 == 0)
            return "FizzBuzz";
        if(value % 3 == 0)
            return "Fizz";
        if(value % 5 == 0)
            return "Buzz";
        return String.valueOf(value);
    }
}
