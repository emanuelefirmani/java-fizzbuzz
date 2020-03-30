package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void should_instantiate(){
        FizzBuzz actual = new FizzBuzz();
        assertThat(actual).isNotNull();
    }

    @Test
    public void should_calculate_multiples_of_3() {
        int[] values = new int[] {3,6,9,12,18,21,24,27};
        FizzBuzz sut = new FizzBuzz();
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Fizz");
        }
    }

    @Test
    public void should_calculate_multiples_of_5() {
        int[] values = new int[] {5,10,20,25,35,40,50,55};
        FizzBuzz sut = new FizzBuzz();
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Buzz");
        }
    }

    @Test
    public void should_calculate_multiples_of_15() {
        int[] values = new int[] {15,30,45,60,75};
        FizzBuzz sut = new FizzBuzz();
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("FizzBuzz");
        }
    }

    @Test
    public void should_calculate_non_multiples() {
        int[] values = new int[] {1,2,4,7,8,11,13,14,16,17,19,22};
        FizzBuzz sut = new FizzBuzz();
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo(String.valueOf(value));
        }
    }
}