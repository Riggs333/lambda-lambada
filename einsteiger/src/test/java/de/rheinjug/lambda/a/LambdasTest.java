package de.rheinjug.lambda.a;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class LambdasTest {
    Lambdas lambdas;

    @BeforeEach
    void setup() {
        this.lambdas = new Lambdas();
    }

    @Disabled
    @Test
    void mittelwertVonNIntegern_10Werte() {
        int range = 10;
        double result = lambdas.mittelwertVonNIntegern(range);
        assertThat(result).isCloseTo(5.0, within(0.001));
    }

    @Disabled
    @Test
    void mittelwertVonNIntegern_100Werte() {
        int range = 100;
        double result = lambdas.mittelwertVonNIntegern(range);
        assertThat(result).isCloseTo(50.0, within(0.001));
    }
}