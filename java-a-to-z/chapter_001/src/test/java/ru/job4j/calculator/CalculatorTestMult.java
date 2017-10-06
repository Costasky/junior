package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTestMult {
    @Test
    public void whenMultipleOneMultipleOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}
