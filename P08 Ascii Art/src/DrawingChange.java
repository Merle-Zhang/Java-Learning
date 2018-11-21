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
   * 
   * @param x        x coordinate for a change
   * @param y        y coordinate for a change
   * @param prevChar previous character in the (x,y)
   * @param newChar  new character in the (x,y)
   */
  public DrawingChange(int x, int y, char prevChar, char newChar) {
    this.x = x;
    this.y = y;
    this.prevChar = prevChar;
    this.newChar = newChar;
  }
}
