package io.github.huyppva.singleton;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class BillPughSingletonTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void getInstance() {
  }

  @Test
  void operate() {
    System.setOut(new PrintStream(outputStreamCaptor));
    BillPughSingleton.getInstance().operate();
    Assertions.assertEquals("BillPughSingleton", outputStreamCaptor.toString()
        .trim());
  }
}