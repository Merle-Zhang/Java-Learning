/**
 * GeometricSequenceGenerator.java
 * 
 * @author Merle Zhang
 * @data 10.31.18
 */

import java.util.Iterator;

/**
 * This class represents a generator for an geometric progression. This class implements the
 * Iterator<Integer> interface
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class GeometricSequenceGenerator implements Iterator<Integer> {
  /**
   * The number of elements in this sequence
   */
  private final int SIZE;

  /**
   * The first term in this sequence
   */
  private final int INIT;

  /**
   * The common ratio for this sequence
   */
  private final int RATIO;

  /**
   * The next term in the sequence
   */
  private int next;

  /**
   * The number of terms generated so far in this sequence. It refers also to the order of the next
   * number to be generated by next() method
   */
  private int generatedCount;

  /**
   * Generates an geometric progression
   * 
   * @param init  initial value
   * @param ratio common ratio
   * @param size  number of elements in the sequence
   */
  public GeometricSequenceGenerator(int init, int ratio, int size) {
    // check for the precondition: size > 0, throws an IllegalArgumentException if this precondition
    // is not satisfied
    if (size <= 0)
      throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    // check for the validity of init (>0) and diff (>0), throw an IllegalArgumentException
    // if these two parameters are not valid
    if (init <= 0 || ratio <= 0)
      throw new IllegalArgumentException(
          "WARNING: The starting element and the common ratio for a geometric progression"
              + " should be STRICTLY POSITIVE.");
    // set the instance fields
    this.SIZE = size;
    this.INIT = init;
    this.RATIO = ratio;
    next = init; // initializes next to the first element in this geometric progression
    generatedCount = 0;
  }

  /**
   * Checks if the iteration has a next element in this sequence
   * 
   * @return true if the current element in the iteration has a next element in this sequence, false
   *         otherwise
   */
  @Override
  public boolean hasNext() {
    // time complexity: O(1)
    return generatedCount < SIZE;
  }

  /**
   * Returns the next element in this geometric sequence iteration with respect to the numbers
   * generated so far
   * 
   * @return the next element in this iteration
   */
  @Override
  public Integer next() {
    // time complexity: O(1)
    if (!hasNext()) // check if the current element has a next element in this sequence
      return null;
    int current = next; // set the current element to next
    generatedCount++; // increment the number of generated elements so far
    next *= RATIO; // set the next element (multiples the common ratio to the current number)
    return current; // return the current number as the generated one
  }

  /**
   * getter of next for testing purpose
   * 
   * @return next
   */
  public int getNext() {
    return next;
  }

  /**
   * setter of next for testing purpose
   * @param next the next element
   */
  public void setNext(int next) {
    this.next = next;
  }

  /**
   * getter of next for testing purpose
   * 
   * @return next
   */
  public int getGeneratedCount() {
    return generatedCount;
  }

  /**
   * setter of generatedCount for testing purpose
   * @param generatedCount the number of elements that generated
   */
  public void setGeneratedCount(int generatedCount) {
    this.generatedCount = generatedCount;
  }

  /**
   * getter of SIZE for testing purpose
   * 
   * @return SIZE
   */
  public int getSIZE() {
    return SIZE;
  }

  /**
   * getter of INIT for testing purpose
   * 
   * @return INIT
   */
  public int getINIT() {
    return INIT;
  }

  /**
   * getter of ratio for testing purpose
   * 
   * @return RATIO
   */
  public int getRATIO() {
    return RATIO;
  }



}
