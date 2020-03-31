package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Mod15Test {
    @Test
    public void should_calculate_multiples_15() {
        Mod15 sut = new Mod15(null);
        int[] values = new int[] {15,30,45,60,75};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("FizzBuzz");
        }
    }

    @Test
    public void should_call_next_chain() {
        ICalculator mockedChain = mock(ICalculator.class);
        Mod15 sut = new Mod15(mockedChain);

        int[] values = new int[] {1,2,1000,-50};
        for (int value : values) {
            String actual = sut.calculate(value);
            verify(mockedChain).calculate(value);
        }

        when(mockedChain.calculate(100)).thenReturn("output");
        String actual = sut.calculate(100);
        assertThat(actual).isEqualTo("output");
    }
}