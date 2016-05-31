import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest1 {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int S = calculator.add(1, 2);
    assertEquals(3, S);
  }
}
