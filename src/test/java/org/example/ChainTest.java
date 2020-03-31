package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ChainTest {
    @Test
    public void should_calculate_multiples_3() {
        Chain sut = new Chain();
        int[] values = new int[]{3, 6, 9, 12, 18, 21, 24, 27};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Fizz");
        }
    }

    @Test
    public void should_calculate_multiples_5() {
        Chain sut = new Chain();
        int[] values = new int[] {5,10,20,25,35,40,50,55};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Buzz");
        }
    }

    @Test
    public void should_calculate_multiples_15() {
        Chain sut = new Chain();
        int[] values = new int[] {15,30,45,60,75};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("FizzBuzz");
        }
    }

    @Test
    public void should_calculate_any() {
        Chain sut = new Chain();
        int[] values = new int[] {1,2,4,7,8,11,22,44,67};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo(String.valueOf(value));
        }
    }
}