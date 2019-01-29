/**
 * FibonacciSequenceGenerator.java
 * 
 * @author Merle Zhang
 * @data 10.31.18
 */

import java.util.Iterator;

/**
 * This class represents a generator for an Fibonacci progression. This class implements the
 * Iterator<Integer> interface
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class FibonacciSequenceGenerator implements Iterator<Integer> {
  /**
   * number of elements in this sequence
   */
  private final int SIZE;

  /**
   * previous item in the sequence with respect to the current iteration
   */
  private int prev;

  /**
   * next item in the sequence with respect to the current iteration
   */
  private int next;

  /**
   * number of items generated so far
   */
  private int generatedCount;


  /**
   * Generates an Fibonacci progression
   * 
   * @param size number of elements in the sequence
   */
  public FibonacciSequenceGenerator(int size) {
    // check for the precondition: size > 0, throws an IllegalArgumentException if this precondition
    // is not satisfied
    if (size <= 0)
      throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    // set the instance fields
    this.SIZE = size;
    this.prev = 0; // prev is initialized to 0 that represents the first item in the standard
                   // Fibonacci sequence
    this.next = 1; // next is initialized to 1 which represents the second item in the same sequence
    this.generatedCount = 0;
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
   * Returns the next element in this Fibonacci sequence iteration with respect to the numbers
   * generated so far
   * 
   * @return the next element in this iteration
   */
  @Override
  public Integer next() {
    // time complexity: O(1)
    if (!hasNext()) // check if the current element has a next element in this sequence
      return null;
    int current = prev; // set the current element to next
    generatedCount++; // increment the number of generated elements so far
    int tmp = next;
    next += prev; // next -> next + prev
    prev = tmp; // prev -> next
    return current; // return the current number as the generated one }
  }

  /**
   * getter of prev for testing purpose
   * 
   * @return prev
   */
  public int getPrev() {
    return prev;
  }

  /**
   * setter of prev for testing purpose
   * @param prev the previous element
   */
  public void setPrev(int prev) {
    this.prev = prev;
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
   * getter of generatedCount for testing purpose
   * 
   * @return generatedCount
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
   * getter of size for testing purpose
   * 
   * @return size
   */
  public int getSIZE() {
    return SIZE;
  }


}
