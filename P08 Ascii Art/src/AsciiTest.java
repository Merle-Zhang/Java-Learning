//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: ASCII Art
// Files: Canvas.java AsciiTest.java DrawingChange.java AsciiArt.java DrawingStack.java DrawingStackIterator.java 
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
 * AsciiTest.java
 * 
 * @author Merle Zhang
 * @data 11.7.18
 */

import java.util.Iterator;

/**
 * test class for ASCII art
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class AsciiTest {

  /**
   * Create a stack, push a DrawingChange onto the stack, and then use peek to verify that the
   * correct item is at the top of the stack
   * 
   * @return true if the peek return the same object with the change, false otherwise
   */
  public static boolean testStackPushPeek() {
    DrawingStack stack = new DrawingStack();
    DrawingChange change = new DrawingChange(1, 1, 'c', 'b');
    stack.push(change);
    if (stack.peek() == change)
      return true;
    return false;
  }

  /**
   * Check if DrawingStack throws IllegalArgumentException when push an null
   * 
   * @return true if succeed, false otherwise
   */
  public static boolean testStackPushException() {
    DrawingStack stack = new DrawingStack();
    try {
      stack.push(null);
    } catch (IllegalArgumentException e) {
      return true;
    }
    return false;
  }

  /**
   * Check if pop and isEmpty works correct
   * 
   * @return true if succeed, false otherwise
   */
  public static boolean testStackPopIsEmpty() {
    DrawingStack stack = new DrawingStack();
    DrawingChange change = new DrawingChange(1, 1, 'c', 'b');
    stack.push(change);
    DrawingChange change2 = stack.pop();
    if (change == change2 && stack.isEmpty())
      return true;
    return false;
  }

  /**
   * Check if size works correct
   * 
   * @return true if succeed, false otherwise
   */
  public static boolean testStackSize() {
    DrawingStack stack = new DrawingStack();
    DrawingChange change = new DrawingChange(1, 1, 'c', 'b');
    stack.push(change);
    if (stack.size() == 1) {
      return true;
    }
    return false;
  }

  /**
   * Check iterator and whether push put the element to te top of the stack and the linked list
   * 
   * @return true if succeed, false otherwise
   */
  public static boolean testStackPushIterator() {
    DrawingStack stack = new DrawingStack();
    DrawingChange change1 = new DrawingChange(1, 1, 'c', 'b');
    DrawingChange change2 = new DrawingChange(3, 2, 's', 'y');
    stack.push(change1);
    stack.push(change2);
    Iterator<DrawingChange> itr = stack.iterator();
    DrawingChange[] change = new DrawingChange[2];
    int i = 0;
    while (itr.hasNext())
      change[i++] = itr.next();
    if (change[0].equals(change2) && change[1].equals(change1)) // check if the push is push to the
                                                                // top of the stack
      // stack/linked list
      return true;
    return false;
  }

  /**
   * Run multiple other test methods. return false if any of its component tests fail, and true if
   * they all succeed
   * 
   * @return true if all test case succeed, false if any of them fail
   */
  public static boolean runStackTestSuite() {
    if (testStackPushPeek() && testStackPushException() && testStackPopIsEmpty() && testStackSize()
        && testStackPushIterator())
      return true;
    return false;
  }

  /**
   * The main method
   * 
   * @param args arguments
   */
  public static void main(String[] args) {
    System.out.println("testStackPushPeek(): " + testStackPushPeek());
    System.out.println("runStackTestSuite(): " + runStackTestSuite());
  }
}
