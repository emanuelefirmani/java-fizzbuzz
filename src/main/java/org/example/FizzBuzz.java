package org.example;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        Chain chain = new Chain();
        for (int i = 1; i <= 20; i++) {
            System.out.println(chain.calculate(i));
        }
    }
}

