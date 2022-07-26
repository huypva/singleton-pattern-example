package io.github.huyppva.singleton;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class SingletonTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void operate() {
    System.setOut(new PrintStream(outputStreamCaptor));
    Singleton.getInstance().operate();
    Assertions.assertEquals("Singleton", outputStreamCaptor.toString()
        .trim());
  }
}