import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  private BigDecimal x;
  private BigDecimal y;

  public Calculator(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public static Calculator of(double x, double y) {
    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }

  public double add() {
    return this.x.add(this.y).doubleValue();
  }

  public double substract() {
    return this.x.subtract(this.y).doubleValue();
  }

  public static void main(String[] args) {
    Calculator calculator =
        new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));
    Calculator c2 = Calculator.of(0.2, 0.1);
    System.out.println(c2.add());
    System.err.println(c2.substract());

    BigDecimal result3 = BigDecimal.valueOf(1.0).divide(BigDecimal.valueOf(3),
        2, RoundingMode.DOWN);
    System.out.println(result3);

    BigDecimal result4 = BigDecimal.valueOf(10)
        .divide(BigDecimal.valueOf(3), 4, RoundingMode.DOWN)
        .add(BigDecimal.valueOf(5.0)).subtract(BigDecimal.valueOf(2.1))
        .setScale(2, RoundingMode.HALF_UP);
    System.out.println(result4);
  }
}
