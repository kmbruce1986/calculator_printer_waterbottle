import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Test
    public void canAdd() {
        int result = calculator.addition(5, 15);
        assertEquals(20, result);
    }

    @Test
    public void canSubtract() {
        int result = calculator.subtraction(10, 3);
        assertEquals(7, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void canDivide(){
        int result = calculator.divide(8, 2);
        assertEquals(4, result);
    }
    }

