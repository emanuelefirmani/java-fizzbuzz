package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.calculate(15);
    }

    public void calculate(int elements) {
        for (int i = 1; i <= elements; i++) {
            if(i % 3 == 0)
                System.out.print("Fizz");
            if(i % 5 == 0)
                System.out.print("Buzz");
            if(i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            System.out.println();
        }
    }
}
