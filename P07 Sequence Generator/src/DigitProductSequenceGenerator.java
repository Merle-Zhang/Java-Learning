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
 * DigitProductSequenceGenerator.java
 * 
 * @author Merle Zhang
 * @data 10.31.18
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class represents a generator for an digit product progression.
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class DigitProductSequenceGenerator {

  /**
   * initial number
   */
  private final int INIT;

  /**
   * size of sequence
   */
  private final int SIZE;

  /**
   * ArrayList object storing the sequence
   */
  private ArrayList<Integer> sequence;

  /**
   * Generates an DigitProduct progression
   * 
   * @param init initial value
   * @param size number of elements in the sequence
   */
  public DigitProductSequenceGenerator(int init, int size) {
    // check for the precondition: size > 0, throws an IllegalArgumentException if this precondition
    // is not satisfied
    if (size <= 0)
      throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    // check for the validity of init (>0) , throw an IllegalArgumentException
    // if this parameter is not valid
    if (init <= 0)
      throw new IllegalArgumentException(
          "WARNING: The starting element for digit product sequence cannot be less than "
              + "or equal to zero.");
    // set the instance fields
    this.SIZE = size;
    this.INIT = init;
    this.sequence = new ArrayList<Integer>(); // initializes sequence to an empty ArrayList of
                                              // elements of type Integer
    generateSequence(); // Generates the digit product sequence and stores its content into sequence
  }

  /**
   * generates the digit product sequence and stores its content into sequence
   */
  public void generateSequence() {
    sequence.clear();
    sequence.add(INIT);
    int tmp;
    int mult; // the multiply part
    int result; // the result which is the next element
    for (int i = 1; i < SIZE; i++) { // add element to the SIZE
      tmp = sequence.get(i - 1);
      result = tmp;
      mult = 1;
      while (tmp != 0) { // multiply up all digits
        if (tmp % 10 != 0)
          mult *= (tmp % 10);
        tmp /= 10;
      }
      result += mult; // add multiply part to the result
      sequence.add(result); // add the element to the sequence
    }
  }

  /**
   * return an Iterator to iterate over the ArrayList sequence field
   * 
   * @return an Iterator to iterate over the ArrayList sequence field
   */
  public Iterator<Integer> getIterator() {
    return sequence.iterator();
  }

  /**
   * getter of sequence for testing purpose
   * 
   * @return sequence
   */
  public ArrayList<Integer> getSequence() {
    return sequence;
  }

  /**
   * setter of sequence for testing purpose
   * 
   * @param sequence the sequence list
   */
  public void setSequence(ArrayList<Integer> sequence) {
    this.sequence = sequence;
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
   * getter of SIZE for testing purpose
   * 
   * @return SIZE
   */
  public int getSIZE() {
    return SIZE;
  }
}
