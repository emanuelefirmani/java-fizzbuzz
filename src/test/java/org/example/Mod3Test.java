package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class Mod3Test {
    @Test
    public void should_calculate_multiples_3() {
        Mod3 sut = new Mod3(null);
        int[] values = new int[] {3,6,9,12,18,21,24,27};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Fizz");
        }
    }

    @Test
    public void should_call_next_chain() {
        ICalculator mockedChain = mock(ICalculator.class);
        Mod3 sut = new Mod3(mockedChain);

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