import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void threePlusSevenShouldBeTen() {
        assertEquals(10, Calculator.addition(3, 7));
    }

    @Test
    void onePlusSevenShouldBeEight() {
        assertEquals(8, Calculator.addition(1, 7));
    }

    @Test
    void zeroPlusMinusNineShouldBeMinusNine() {
        assertEquals(-9, Calculator.addition(1, -10));
    }

    @Test
    void threeMinusSevenShouldBeMinusFour() {
        assertEquals(-4, Calculator.subtration(3, 7));
    }

    @Test
    void oneMinusSevenShouldBeMinusSix() {
        assertEquals(-6, Calculator.subtration(1, 7));
    }

    @Test
    void zeroMinusMinusNineShouldBeNine() {
        assertEquals(9, Calculator.subtration(0, -9));
    }

    @Test
    void threeSevenTimesShouldBeTwentyOne() {
        assertEquals(21, Calculator.multiplication(3, 7));
    }

    @Test
    void oneSevenTimesShouldBeZero() {
        assertEquals(7, Calculator.multiplication(1, 7));
    }

    @Test
    void zeroMinusNineTimesShouldBeZero() {
        assertEquals(0, Calculator.multiplication(0, -9));
    }

    @Test
    void NineDivideByThreeShouldBeThree() {
        assertEquals(3, Calculator.division(9, 3));
    }

    @Test
    void FiveteenDivideByFiveShouldBeThree() {
        assertEquals(3, Calculator.division(15, 5));
    }

    @Test
    void zeroDivideByMinusNineShouldBeZero() {
        assertEquals(0, Calculator.division(0, -9));
    }
}