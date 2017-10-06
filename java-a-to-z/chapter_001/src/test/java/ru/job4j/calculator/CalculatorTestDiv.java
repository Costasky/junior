package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class CalculatorTestDiv {
        @Test
        public void whenDivideOneDivideOneThenNegativeOne() {
            Calculator calc = new Calculator();
            calc.div(1D, 1D);
            double result = calc.getResult();
            double expected = 1D;
            assertThat(result, is(expected));
        }
    }
