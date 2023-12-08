import java.math.BigDecimal;

public class Circle {
  private double radius;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double diameter() {
    return this.radius * 2;
  }

  public double area() {
    return Math.pow(radius, 2) * Math.PI;
  }

  public static double area(double radius) {
    return (BigDecimal.valueOf(radius).pow(2).multiply(BigDecimal.valueOf(Math.PI)).doubleValue());
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.4d);
    double diameter1 = circle.diameter();
    double area1 = circle.area();
    System.out.println("Diameter: " + diameter1 + "Area: " + area1);
    double area2 = area(3.4);
    System.out.println(area2);
  }
}
