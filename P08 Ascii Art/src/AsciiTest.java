/**
 * AsciiTest.java
 * 
 * @author Merle Zhang
 * @data 11.7.18
 */


/**
 * test class for ASCII art
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class AsciiTest {

  /**
   * create a stack, push a DrawingChange onto the stack, and then use peek to verify that the
   * correct item is at the top of the stack
   * 
   * @return true if the peek return the same object with the change, false otherwise
   */
  public static boolean testStackPushPeek() {
    DrawingStack stack = new DrawingStack();
    DrawingChange change = new DrawingChange(1,1,'c','b');
    stack.push(change);
    if (stack.peek() == change)
      return true;
    return false;
  }

  public static void main(String[] args) {
    System.out.println("testStackPushPeek(): " + testStackPushPeek());
    
  }

}
