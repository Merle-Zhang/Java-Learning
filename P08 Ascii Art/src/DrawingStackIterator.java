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
 * DrawingStackIterator.java
 * 
 * @author Merle Zhang
 * @data 11.7.18
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * the class for iterator of DrawingStack
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class DrawingStackIterator implements Iterator<DrawingChange> {

  /**
   * the current node
   */
  private Node<DrawingChange> curr;

  /**
   * the constructor of class DrawingStackIterator
   * 
   * @param node the first node iteration start from
   */
  public DrawingStackIterator(Node<DrawingChange> node) {
    this.curr = node;
  }

  /**
   * Return true if has next element, i.e., if current element is null
   * 
   * @return true if current is not null, false otherwise
   */
  @Override
  public boolean hasNext() {
    return curr != null ? true : false;
  }

  /**
   * Return the next element, i.e., return current element and set current to the next element. If
   * current element is null, print NoSuchElementException
   * 
   * @return current element
   */
  @Override
  public DrawingChange next() {
    try {
      DrawingChange tmp = this.curr.getData();
      this.curr = this.curr.getNext();
      return tmp;
    } catch (NullPointerException e) { // if current is null, the it means that there is no such
                                       // element
      throw new NoSuchElementException();
    }
  }
}
