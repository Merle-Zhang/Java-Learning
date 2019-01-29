/**
 * SequenceGeneratorTests.java
 * 
 * @author Merle Zhang
 * @data 10.31.18
 */

import java.util.Iterator;

/**
 * Test class for Sequence class and each Generator class
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class SequenceGeneratorTests {

  /**
   * instantiate a GeometricSequenceGenerator with parameters 5, 2, 6. Test every field and next()
   * and hasNext() and field after this
   * 
   * @return false if either the constructor or hasNext() or next() method does not return the
   *         expected output
   */
  public static boolean geometricSequenceGeneratorTest() {
    GeometricSequenceGenerator gsg = new GeometricSequenceGenerator(5, 2, 6);
    if (gsg.getSIZE() == 6 && gsg.getINIT() == 5 && gsg.getRATIO() == 2 && gsg.getNext() == 5
        && gsg.next() == 5 && gsg.getGeneratedCount() == 1 && gsg.getNext() == 10
        && gsg.hasNext() == true)
      return true;
    return false;
  }

  /**
   * instantiate a FibonacciSequenceGenerator with parameters 10. Test every field and next() and
   * hasNext() and field after this
   * 
   * @return false if either the constructor or hasNext() or next() method does not return the
   *         expected output
   */
  public static boolean fibonacciSequenceGeneratorTest() {
    FibonacciSequenceGenerator fsg = new FibonacciSequenceGenerator(10);
    if (fsg.getSIZE() == 10 && fsg.getPrev() == 0 && fsg.getNext() == 1 && fsg.next() == 0
        && fsg.getGeneratedCount() == 1 && fsg.getPrev() == 1 && fsg.getNext() == 1
        && fsg.hasNext() == true)
      return true;
    return false;
  }

  /**
   * instantiate a DigitProductSequenceGenerator with parameters 13, 5. Test every field and next()
   * and hasNext() and field after this
   * 
   * @return false if either the constructor or hasNext() or next() method does not return the
   *         expected output
   */
  public static boolean digitProductSequenceGeneratorTest() {
    DigitProductSequenceGenerator dpsg = new DigitProductSequenceGenerator(13, 5);
    Iterator<Integer> itr = dpsg.getIterator();
    // test fields and methods
    if (dpsg.getSIZE() == 5 && dpsg.getINIT() == 13 && itr.next() == 13 && itr.next() == 16
        && itr.hasNext() == true) {
    } else
      return false;
    // test the correct error message
    try {
      DigitProductSequenceGenerator test1 = new DigitProductSequenceGenerator(13, -1);
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().equals("WARNING: CANNOT create a sequence with size <= zero."))
        return false;
    }
    try {
      DigitProductSequenceGenerator test2 = new DigitProductSequenceGenerator(-13, 5);
    } catch (IllegalArgumentException e) {
      if (!e.getMessage()
          .equals("WARNING: The starting element for digit product sequence cannot be less than "
              + "or equal to zero."))
        return false;
    }
    return true;
  }

  /**
   * main method to test program
   * 
   * @param args arguments
   */
  public static void main(String[] args) {
    System.out.println("geometricSequenceGeneratorTest(): " + geometricSequenceGeneratorTest());
    System.out.println("fibonacciSequenceGeneratorTest(): " + fibonacciSequenceGeneratorTest());
    System.out
        .println("digitProductSequenceGeneratorTest(): " + digitProductSequenceGeneratorTest());

  }

}
