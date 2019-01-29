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
