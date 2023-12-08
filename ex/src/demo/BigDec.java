import java.math.BigDecimal;

public class BigDec {
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println("bd3 = " + bd3.doubleValue());// 0.3

    BigDecimal bd4 = BigDecimal.valueOf(0.2);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);

    BigDecimal result = bd4.add(bd5);
    System.out.println("result = " + result.doubleValue()); // 0.3

    double s2 = 0.3 - 0.1;
    System.out.println(s2); // 0.19999999999999998

    BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println("result 2 = " + b1.doubleValue());

    BigDecimal b2 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
    System.out.println("divide result = " + b2.doubleValue());

    BigDecimal b3 = BigDecimal.valueOf(0.3).multiply(BigDecimal.valueOf(0.1));
    System.out.println("multi result = " + b3.doubleValue());

    System.out.println(sum(0.3, 0.1));
  }

  public static double sum(double d1, double d2) {
    return (BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2))).doubleValue();
  }
}
