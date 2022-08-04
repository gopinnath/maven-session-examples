package tpa.onepam.kingpins.mastery.maven.example;

public class Circle implements Shape{

  private Double radius;

  public Circle(Double radius) {
    this.radius = radius;
  }

  public Double perimeter() {
    return 2 * 3.142 * radius;
  }

  public Double area() {
    return 3.142 * radius * radius;
  }
}
