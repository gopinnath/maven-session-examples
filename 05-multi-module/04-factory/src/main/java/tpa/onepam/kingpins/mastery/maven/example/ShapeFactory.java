package tpa.onepam.kingpins.mastery.maven.example;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {

  public static Shape getInstance(String classname,int numberOfConstructorParams, Double ...params)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
      InstantiationException, IllegalAccessException {
    Class[] paramTypes = new Class[numberOfConstructorParams];
    for(int i = 0; i < numberOfConstructorParams; i++) {
      paramTypes[i] = Double.class;
    }
    return (Shape) Class.forName(classname).getConstructor(paramTypes).newInstance(params);
  }
}
