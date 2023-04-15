package com.diefesson.vv2.q1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FahrenheitCelsiusConverterTest {

    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        assertEquals(32, FahrenheitCelsiusConverter.toFahrenheit(0));
        assertEquals(98, FahrenheitCelsiusConverter.toFahrenheit(37));
        assertEquals(212, FahrenheitCelsiusConverter.toFahrenheit(100));
    }

    @Test
    public void shouldConvertFahrenheitToCelsius() {
        assertEquals(0, FahrenheitCelsiusConverter.toCelsius(32));
        assertEquals(37, FahrenheitCelsiusConverter.toCelsius(100));
        assertEquals(100, FahrenheitCelsiusConverter.toCelsius(212));
    }
}
