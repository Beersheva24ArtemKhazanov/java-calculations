package telran.introducions;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introducions.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(9, multiply(3, 3));
        assertEquals(2, divide(10, 5));
        assertEquals(16, sumOfDigits(8));
        assertEquals(18, maxDigit(18, 15));
        assertEquals(true, isDividedOn(18, 6));
    }
}
