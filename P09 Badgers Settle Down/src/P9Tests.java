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
 * P9Tests.java
 * 
 * @author Merle Zhang
 * @date 11.28.18
 */
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The test class for P9, which is for Badger and Sett class
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class P9Tests {

  /**
   * Returns true when all Badger tests pass
   * 
   * @return true when all Badger tests pass, false otherwise.
   */
  public static boolean runAllBadgerTests() {
    if (testBadgerSetLeft() && testBadgerSetRight() && testBadgerConstructor())
      return true;
    else
      return false;
  }

  /**
   * Test setter and getter of left child of Badger.
   * 
   * @return true if they work correctly, false otherwise.
   */
  private static boolean testBadgerSetLeft() {
    Badger bgr = new Badger(2);
    Badger lBgr = new Badger(1);
    bgr.setLeftLowerNeighbor(lBgr);
    if (bgr.getLeftLowerNeighbor() == lBgr)
      return true;
    else
      return false;
  }

  /**
   * Test setter and getter of right child of Badger.
   * 
   * @return true if they work correctly, false otherwise.
   */
  private static boolean testBadgerSetRight() {
    Badger bgr = new Badger(2);
    Badger rBgr = new Badger(3);
    bgr.setRightLowerNeighbor(rBgr);
    if (bgr.getRightLowerNeighbor() == rBgr)
      return true;
    else
      return false;
  }

  /**
   * Test size and Constructor
   * 
   * @return true if they work correctly, false otherwise
   */
  private static boolean testBadgerConstructor() {
    Badger bgr = new Badger(2);
    if (bgr.getSize() == 2)
      return true;
    else
      return false;
  }


  /**
   * Test all function of Sett
   * 
   * @return true if they work correctly, false otherwise
   */
  private static boolean testSett() {
    Sett sett = new Sett();
    int[] sizes = new int[] {5, 3, 2, 7, 9, 4, 8, 1, 6, 10};
    for (int size : sizes)
      sett.settleBadger(size);

    if (!sett.isEmpty() && sett.findBadger(1).getSize() == 1 && sett.countBadger() == 10
        && testSettAllBadgers() && sett.getHeight() == 4
        && sett.getLargestBadger().getSize() == 10) {
      sett.clear();
      if (sett.getTopBadger() == null)
        return true;
    }
    return false;
  }

  /**
   * Test settleBadger
   * 
   * @return true if it works correctly, false otherwise
   */
  private static boolean testSettle() {
    Sett sett = new Sett();
    try {
      sett.settleBadger(1);
      sett.settleBadger(2);
    } catch (IllegalArgumentException e) {
      return false;
    } catch (Exception e) {
      return false;
    }

    try {
      sett.settleBadger(1);
    } catch (IllegalArgumentException e) {
      if (e.getMessage().equals("WARNING: failed to settle the badger with size 1,"
          + " as there is already a badger with the same size in this sett"))
        return true;
    } catch (Exception e) {
      return false;
    }
    return false;
  }

  /**
   * Test findBadger
   * 
   * @return true if it works correctly, false otherwise
   */
  private static boolean testFind() {
    Sett sett = new Sett();
    sett.settleBadger(1);
    sett.settleBadger(2);
    try {
      sett.findBadger(1);
    } catch (NoSuchElementException e) {
      return false;
    } catch (Exception e) {
      return false;
    }

    try {
      sett.findBadger(5);
    } catch (NoSuchElementException e) {
      if (e.getMessage().equals("WARNING: failed to find a badger with size 5 in the sett")) 
        return true;
    } catch (Exception e) {
      return false;
    }
    return false;
  }

  /**
   * Test getAllBadgers
   * 
   * @return true if it works correctly, false otherwise
   */
  private static boolean testSettAllBadgers() {
    Sett sett = new Sett();
    int[] sizes = new int[] {5, 3, 2, 7, 9, 4, 8, 1, 6, 10};
    for (int size : sizes)
      sett.settleBadger(size);
    List<Badger> allBadger = sett.getAllBadgers();
    for (int i = 1; i <= 10; i++)
      if (allBadger.get(i - 1).getSize() != i)
        return false;
    return true;
  }


  /**
   * Test topBadger and Constructor
   * 
   * @return true if they work correctly, false otherwise
   */
  private static boolean testSettConstructor() {
    Sett sett = new Sett();
    if (sett.getTopBadger() == null)
      return true;
    else
      return false;
  }

  /**
   * Returns true when all Sett tests pass
   * 
   * @return true when all Sett tests pass, false otherwise
   */
  public static boolean runAllSettTests() {
    if (testSettConstructor() && testSettle() && testFind() && testSettAllBadgers() && testSett()
        && testSettConstructor())
      return true;
    else
      return false;
  }

  /**
   * The main function
   * 
   * @param args the arguments
   */
  public static void main(String[] args) {
    System.out.println("runAllBadgerTests(): " + runAllBadgerTests());
    System.out.println("runAllSettTests(): " + runAllSettTests());
  }

}
