package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void sum() {
    int sum = new Main().sum(2, 3);
    Assertions.assertTrue(sum == 5);
  }
}