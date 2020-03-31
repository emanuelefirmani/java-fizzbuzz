package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Mod1Test {
    @Test
    public void should_calculate_any() {
        Mod1 sut = new Mod1();
        int[] values = new int[] {12, 3, 7, -5, 0};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo(String.valueOf(value));
        }
    }
}