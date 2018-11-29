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
 * Sett.java
 * 
 * @author Merle Zhang
 * @date 11.28.18
 */
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * This class represents a Sett, where a group of Badgers live together. Each Sett is organized as a
 * BST of Badger nodes.
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Sett {

  /**
   * The Badger living on the top of the current Sett.
   */
  private Badger topBadger;

  /**
   * Constructs an empty Sett.
   */
  public Sett() {

  }

  /**
   * Retrieve the top Badger within this Sett (the one that was settled first).
   * 
   * @return The Badger living on the top of the current Sett.
   */
  public Badger getTopBadger() {
    return this.topBadger;
  }

  /**
   * Checks whether this Sett is empty.
   * 
   * @return true if this Sett is empty, false otherwise.
   */
  public boolean isEmpty() {
    return this.topBadger == null;
  }

  /**
   * Creates a new Badger object with the specified size, and inserts them into this Sett (BST).
   * 
   * @param size The size of the new Badger that will be settled.
   * @throws java.lang.IllegalArgumentException When a Badger with the specified size already exists
   *         within this Sett. The message in this exception must read: "WARNING: failed to settle
   *         the badger with size {size}, as there is already a badger with the same size in this
   *         sett".
   */
  public void settleBadger(int size) throws java.lang.IllegalArgumentException {
    // NOTE: I considered to put this empty BST case into helper method to make this method clean
    // But I believe this is a special case that only possibly appear once, so it shouldn't be in
    // the recursive method
    if (this.topBadger == null)
      this.topBadger = new Badger(size);
    else
      settleHelper(this.topBadger, new Badger(size));
  }

  /**
   * This recursive helper method is used to help settle a new Badger within this Sett.
   * 
   * @param current   The current Badger (previously settled within this Sett) that we are
   *                  considering settling the newBadger beneath (either to its left or right).
   * @param newBadger The new Badger that needs to be settled within this Sett.
   * @throws java.lang.IllegalArgumentException When a Badger with the specified size already exists
   *         within this Sett. The message in this exception must read: "WARNING: failed to settle
   *         the badger with size {size}, as there is already a badger with the same size in this
   *         sett".
   */
  private void settleHelper(Badger current, Badger newBadger)
      throws java.lang.IllegalArgumentException {
    int currentSize = current.getSize();
    int newBadgerSize = newBadger.getSize();
    if (currentSize == newBadgerSize)
      throw new IllegalArgumentException("WARNING: failed to settle the badger with size "
          + newBadger.getSize() + ", as there is already a badger with the same size in this sett");
    if (currentSize > newBadgerSize) {
      if (current.getLeftLowerNeighbor() == null)
        current.setLeftLowerNeighbor(newBadger);
      else
        settleHelper(current.getLeftLowerNeighbor(), newBadger);
    } else {
      if (current.getRightLowerNeighbor() == null)
        current.setRightLowerNeighbor(newBadger);
      else
        settleHelper(current.getRightLowerNeighbor(), newBadger);
    }
  }

  /**
   * Finds a Badger of a specified size in this Sett.
   * 
   * @param size The size of the Badger object to search for and return.
   * @return The Badger found with the specified size.
   * @throws java.util.NoSuchElementException When there is no Badger in this Sett with the
   *         specified size. The message within this exception must read "WARNING: failed to find a
   *         badger with size {size} in the sett".
   */
  public Badger findBadger(int size) throws java.util.NoSuchElementException {
    return findHelper(this.topBadger, size);
  }

  /**
   * This recursive helper method is used to help find a Badger within this Sett.
   * 
   * @param current The current Badger that is the root of a (sub) tree that we are searching for a
   *                Badger with the specified size within.
   * @param size    The size of the Badger object to search for and return.
   * @return The Badger found with the specified size.
   * @throws java.util.NoSuchElementException When there is no Badger in this Sett with the
   *         specified size. The message within this exception must read "WARNING: failed to find a
   *         badger with size {size} in the sett".
   */
  private Badger findHelper(Badger current, int size) throws java.util.NoSuchElementException {
    if (current == null)
      throw new NoSuchElementException(
          "WARNING: failed to find a badger with size " + size + " in the sett");
    if (current.getSize() == size)
      return current;
    else if (current.getSize() > size)
      return findHelper(current.getLeftLowerNeighbor(), size);
    else
      return findHelper(current.getRightLowerNeighbor(), size);
  }

  /**
   * Counts how many Badgers live in this Sett.
   * 
   * @return The number of Badgers living in this Sett.
   */
  public int countBadger() {
    return countHelper(this.topBadger);
  }

  /**
   * This recursive helper method is used to help count the number of Badgers in this Sett.
   * 
   * @param current The current Badger that is the root of a (sub) tree that we are counting the
   *                number of Badgers within.
   * @return the number of Badgers living in the Sett rooted at the current Badger.
   */
  private int countHelper(Badger current) {
    if (current == null)
      return 0;
    else
      return countHelper(current.getLeftLowerNeighbor())
          + countHelper(current.getRightLowerNeighbor()) + 1;
  }

  /**
   * Gets all Badgers living in the Sett as a list in ascending order of their size: smallest one in
   * the front (at index zero), through the largest one at the end (at index size-1).
   * 
   * @return A list of all Badgers living in the Sett in ascending order by size.
   */
  public java.util.List<Badger> getAllBadgers() {
    ArrayList<Badger> retn = new ArrayList<Badger>();
    getAllHelper(this.topBadger, retn);
    return retn;
  }

  /**
   * This recursive helper method is used to help collect the Badgers within this Sett into a List.
   * 
   * @param allBadgers The list of all Badgers living in the Sett that is rooted at the current
   *                   Badger node. The contents of this list should be in ascending order by Badger
   *                   size.
   * @param current    The current Badger that is the root of a (sub) tree that we are collecting
   *                   all contained Badgers within, into the allBadgers List.
   */
  private void getAllHelper(Badger current, java.util.List<Badger> allBadgers) {
    if (current == null)
      return;
    else {
      getAllHelper(current.getLeftLowerNeighbor(), allBadgers);
      allBadgers.add(current);
      getAllHelper(current.getRightLowerNeighbor(), allBadgers);
    }
  }

  /**
   * Computes the height of the Sett, as the number of nodes from root to the deepest leaf Badger
   * node.
   * 
   * @return The depth of this Sett.
   */
  public int getHeight() {
    return getHeightHelper(this.topBadger);
  }

  /**
   * This recursive helper method is used to help compute the height of this Sett.
   * 
   * @param current The current Badger that is the root of a (sub) tree that we are calculating the
   *                height of.
   * @return The height of the (sub) tree that we are calculating.
   */
  private int getHeightHelper(Badger current) {
    if (current == null)
      return 0;
    else {
      int leftHeight = getHeightHelper(current.getLeftLowerNeighbor());
      int rightHeight = getHeightHelper(current.getRightLowerNeighbor());
      return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
  }

  /**
   * Retrieves the largest Badger living in this Sett.
   * 
   * @return The largest Badger living in this Sett.
   */
  public Badger getLargestBadger() {
    if (this.topBadger == null)
      return null;
    else {
      Badger retn = this.topBadger;
      while (retn.getRightLowerNeighbor() != null)
        retn = retn.getRightLowerNeighbor();
      return retn;
    }
  }

  /**
   * Empties this Sett, to no longer contain any Badgers.
   */
  public void clear() {
    this.topBadger = null;
  }
}
