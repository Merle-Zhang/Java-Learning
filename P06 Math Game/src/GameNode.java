//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Math Game
// Files: GameApplication.java, GameList.java, GameNode.java, GameTests.java
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
import java.util.Random;

/**
 * Class GameNode
 * <p>
 * The GameNode class represents a single number within this linked list
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class GameNode {

  /**
   * the number held within this node
   */
  private int number;

  /**
   * the next GameNode in the list, or null for the last node
   */
  private GameNode next;

  /**
   * initializes number to random 1-9 value, and next to null
   * 
   * @param rng the Random object
   */
  public GameNode(Random rng) {
    // number should be 1-9 inclusive, so it cannot be 0
    this.number = rng.nextInt(9) + 1;
    this.next = null;
  }

  /**
   * accessor for the number field
   * 
   * @return the number held within this node
   */
  public int getNumber() {
    return this.number;
  }

  /**
   * accessor for the next field
   * 
   * @return the next field
   */
  public GameNode getNext() {
    return next;
  }

  /**
   * mutator for the next field
   * 
   * @param next the next field
   */
  public void setNext(GameNode next) {
    this.next = next;
  }

  /**
   * change nodes number and next fields. The new number for this node is calculated by applying the
   * provided operator to this node number (the first operand), and the next node number (the
   * second operand). The new next reference for this node should be copied from the next reference
   * of the following node in the list so that the following node is effectively removed from the
   * list. When this method is called on the node that is at the end of a list, then a
   * NullPointerException may be thrown to indicate this problem.
   * 
   * @param operator the operator that will be used
   */
  public void applyOperator(GameOperator operator) {
    this.number = operator.apply(this.number, this.next.number);
    this.next = this.next.next;
  }
}
