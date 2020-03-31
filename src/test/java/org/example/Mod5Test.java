package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Mod5Test {
    @Test
    public void should_calculate_multiples_5() {
        Mod5 sut = new Mod5();
        int[] values = new int[] {5,10,20,25,35,40,50,55};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Buzz");
        }
    }

    @Test
    public void should_return_null() {
        Mod5 sut = new Mod5();
        int[] values = new int[] {1,2,3,14,21,29,31};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isNull();
        }
    }
}