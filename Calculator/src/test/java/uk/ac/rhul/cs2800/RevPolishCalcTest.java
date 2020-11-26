package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {

  RevPolishCalc revCalc;

  @BeforeEach
  public void setup() {
    revCalc = new RevPolishCalc();
  }

  @Test
  // 1st Test
  // To pass this test I created a new RevPolishCalc class that implements the CalculatorInterface
  // along with the evaluate method. I faked this test by getting the method to return 9.
  void testFloat() throws InvalidExpressionException {
    assertEquals(revCalc.evaluate("7 2 +"), 9, "Test to see if a float is returned");
  }

  @Test
  // 2nd Test
  // To pass this test I added a scanner that reads the
  // input of the string given to it and prints it to the console.
  void testReadingString() throws InvalidExpressionException {
    // assertEquals(revCalc.evaluate("7 2 +"), "72+");
    assertEquals(revCalc.evaluate("7 2 +"), 9,
        "Test to see if the string/expression passed is being read");
  }

  @Test
  // 3rd Test
  // To pass this test I added a check at the beginning to 
  // check if the string is empty, throw the exception
  void testNoInput() {
    assertThrows(InvalidExpressionException.class, () -> revCalc.evaluate(""),
        "Test to see if the invalidexpression exception is thrown");
  }

}
