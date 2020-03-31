package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

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
}