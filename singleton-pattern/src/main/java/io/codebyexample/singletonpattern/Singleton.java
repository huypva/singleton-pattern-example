package io.codebyexample.singletonpattern;

/**
 * @author huypva
 */
public class Singleton {

  private static final Singleton instance = new Singleton();

  public Singleton() {
    //Do something in constructor
  }

  public static Singleton getInstance() {
    
    return instance;
  }

  public void operate() {
    System.out.println("Singleton");
  }
}
