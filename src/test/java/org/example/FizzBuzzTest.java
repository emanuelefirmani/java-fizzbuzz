package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void should_instantiate(){
        FizzBuzz actual = new FizzBuzz();
        assertThat(actual).isNotNull();
    }
}