package io.github.huyppva.singleton;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class DoubleCheckedSingletonTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void operate() {
    System.setOut(new PrintStream(outputStreamCaptor));
    DoubleCheckedSingleton.getInstance().operate();
    Assertions.assertEquals("DoubleCheckedSingleton", outputStreamCaptor.toString()
        .trim());
  }
}