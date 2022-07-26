package io.github.huyppva.singleton;

/**
 * @author huypva
 */
public class LazySingleton {

  private static LazySingleton instance;

  public LazySingleton() {
    //Do something in constructor
  }

  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }

    return instance;
  }

  public void operate() {
    System.out.println("LazySingleton");
  }
}
