package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Mod5Test {
    @Test
    public void should_calculate_multiples_5() {
        Mod5 sut = new Mod5(null);
        int[] values = new int[] {5,10,20,25,35,40,50,55};
        for (int value : values) {
            String actual = sut.calculate(value);
            assertThat(actual).isEqualTo("Buzz");
        }
    }

    @Test
    public void should_call_next_chain() {
        ICalculator mockedChain = mock(ICalculator.class);
        Mod5 sut = new Mod5(mockedChain);

        int[] values = new int[] {1,2,999,-51};
        for (int value : values) {
            String actual = sut.calculate(value);
            verify(mockedChain).calculate(value);
        }

        when(mockedChain.calculate(99)).thenReturn("output");
        String actual = sut.calculate(99);
        assertThat(actual).isEqualTo("output");
    }
}