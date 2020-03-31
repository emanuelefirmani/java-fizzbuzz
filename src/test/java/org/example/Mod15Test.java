package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Mod15Test {
    @Test
    public void should_calculate_multiples_15() {
        Mod15 sut = new Mod15();
        int[] values = new int[] {15,30,45,60,75};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("FizzBuzz");
        }
    }
}