package io.github.huyppva.singleton;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Singleton.getInstance().operate();
    LazySingleton.getInstance().operate();
    DoubleCheckedSingleton.getInstance().operate();
    BillPughSingleton.getInstance().operate();
  }
}
