package io.github.huyppva.singleton;

/**
 * @author huypva
 */
public class DoubleCheckedSingleton {

  private static DoubleCheckedSingleton instance;

  public DoubleCheckedSingleton() {
    //Do something in constructor
  }

  public static DoubleCheckedSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckedSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckedSingleton();
        }
      }
    }

    return instance;
  }

  public void operate() {
    System.out.println("DoubleCheckedSingleton");
  }
}
