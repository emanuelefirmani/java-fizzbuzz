package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class Mod3Test {
    @Test
    public void should_calculate_multiples_3() {
        Mod3 sut = new Mod3();
        int[] values = new int[] {3,6,9,12,18,21,24,27};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Fizz");
        }
    }

    @Test
    public void should_return_null() {
        Mod3 sut = new Mod3();
        int[] values = new int[] {1,2,4,10,14,20,29,31};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isNull();
        }
    }
}