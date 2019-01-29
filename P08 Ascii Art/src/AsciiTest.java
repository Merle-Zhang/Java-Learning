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
