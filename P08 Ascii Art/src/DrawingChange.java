/**
 * DrawingChange.java
 * 
 * @author Merle Zhang
 * @date 11.7.18
 */

/**
 * the class represent a drawing change
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class DrawingChange {

  /**
   * x coordinate for a change
   */
  public final int x;

  /**
   * y coordinate for a change
   */
  public final int y;

  /**
   * previous character in the (x,y)
   */
  public final char prevChar;

  /**
   * new character in the (x,y)
   */
  public final char newChar;

  /**
   * constructor of class DrawingChange, initialize fields
   * @param x x coordinate for a change
   * @param y y coordinate for a change
   * @param prevChar previous character in the (x,y)
   * @param newChar new character in the (x,y)
   */
  public DrawingChange(int x, int y, char prevChar, char newChar) {
    this.x = x;
    this.y = y;
    this.prevChar = prevChar;
    this.newChar = newChar;
  }

}
