//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Badger Settle Down
// Files: Badger.java Sett.java P9Tests.java
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
 * Badger.java
 * 
 * @author Merle Zhang
 * @date 11.28.18
 */


/**
 * This class represents a Badger which is designed to live in a Sett. Each Badger object represents
 * a single node within a BST (known as a Sett).
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Badger {

  /**
   * This badger's lower left neighbor
   */
  private Badger leftLowerNeighbor;

  /**
   * This badger's lower right neighbor.
   */
  private Badger rightLowerNeighbor;

  /**
   * The size of this badger.
   */
  private int size;

  /**
   * Creates a new Badger with specified size.
   * 
   * @param size The size of the newly constructed Badger object.
   */
  public Badger(int size) {
    this.size = size;
  }

  /**
   * Retrieves neighboring badger that is smaller than this one.
   * 
   * @return The left lower neighbor of current badger.
   */
  public Badger getLeftLowerNeighbor() {
    return this.leftLowerNeighbor;
  }

  /**
   * Changes this badger's lower left neighbor.
   * 
   * @param badger The new left lower neighbor of current badger.
   */
  public void setLeftLowerNeighbor(Badger badger) {
    this.leftLowerNeighbor = badger;
  }

  /**
   * Retrieves neighboring badger that is larger than this one.
   * 
   * @return The right lower neighbor of current badger.
   */
  public Badger getRightLowerNeighbor() {
    return this.rightLowerNeighbor;
  }

  /**
   * Changes this badger's lower right neighbor.
   * 
   * @param badger The new right lower neighbor of current badger.
   */
  public void setRightLowerNeighbor(Badger badger) {
    this.rightLowerNeighbor = badger;
  }

  /**
   * Retrieves the size of this badger.
   * 
   * @return The size of current badger.
   */
  public int getSize() {
    return this.size;
  }

}
