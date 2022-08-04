package tpa.onepam.kingpins.mastery.maven.example;

import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
      InstantiationException, IllegalAccessException {
    Shape circle = ShapeFactory
        .getInstance("tpa.onepam.kingpins.mastery.maven.example.Circle"
            , 1, 10d);
    System.out.println(circle.perimeter());
    System.out.println(circle.area());
    System.out.println(circle.getClass().getName());
    Shape square = ShapeFactory
        .getInstance("tpa.onepam.kingpins.mastery.maven.example.Square"
            , 1, 10d);
    System.out.println(square.perimeter());
    System.out.println(square.area());
    System.out.println(square.getClass().getName());
  }
}
