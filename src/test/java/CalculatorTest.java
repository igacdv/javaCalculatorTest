import org.testng.Assert;
import org.testng.annotations.Test;
import pl.cdv.Calculator;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 2;
        int y = 3;
        int wynik = Calculator.add(x,y);
        Assert.assertEquals(wynik, 5);
    }

    @Test
    public void testMultiply() {
        int x = 2;
        int y = 3;
        int result = Calculator.multiply(x,y);
        Assert.assertEquals(result, 6);
    }

}
