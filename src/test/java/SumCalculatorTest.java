import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        this.calculator = new SumCalculator();
    }

    @Test
    public void testThatSumCorrectFor1() {
        int actual = this.calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumCorrectFor3() {
        int actual = this.calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorkFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> this.calculator.sum(0));
    }
}