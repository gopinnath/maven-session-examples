package tpa.onepam.kingpins.mastery.maven.example;

public class Square implements Shape{

  private Double sides;

  public Square(Double sides) {
    this.sides = sides;
  }

  @Override
  public Double perimeter() {
    return sides * 4;
  }

  @Override
  public Double area() {
    return sides * sides;
  }
}
