import calc.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple add should work")
    public void testAdd() {
        assertEquals(20, calculator.add(10, 10), "Regular add should work");
    }

    @Test
    @DisplayName("Simple add should work")
    public void testAdd2() {
        assertEquals(30, calculator.add(20, 10), "Regular add should work");
    }

    @Test
    @DisplayName("Simple add should work")
    public void testAdd3() {
        assertEquals(40, calculator.add(30, 10), "Regular add should work");
    }
}
