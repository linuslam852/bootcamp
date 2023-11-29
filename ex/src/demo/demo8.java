package demo;
public class demo8 {
  public static void main(String[] args) {
    Long l1 = 10L;
    Integer i1 = Integer.parseInt(String.valueOf(l1));
    Integer i2 = l1.intValue();
    System.out.println(i1);
    System.out.println(i2);
  }
}
