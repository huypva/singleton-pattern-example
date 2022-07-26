package io.github.huyppva.singleton;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class LazySingletonTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void operate() {
    System.setOut(new PrintStream(outputStreamCaptor));
    LazySingleton.getInstance().operate();
    Assertions.assertEquals("LazySingleton", outputStreamCaptor.toString()
        .trim());
  }
}