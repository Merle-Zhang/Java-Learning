//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Sequence Generator
// Files: Sequence.java GeometricSequenceGenerator.java FibonacciSequenceGenerator.java 
//          DigitProductSequenceGenerator.java SequenceGeneratorTests.java
// Course: Comp Sci 300, Fall, 2018
//
// Author: Merle Zhang
// Email: xzhang2229@wisc.edu
// Lecturer's Name: Alexander Brooks
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: NONE
// Partner Email: NONE
// Partner Lecturer's Name: NONE
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
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
