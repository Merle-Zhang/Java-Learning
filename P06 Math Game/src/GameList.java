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
/**
 * Class GameList
 * <p>
 * the list of numbers that the player will be selecting from and modifying
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class GameList {

  /**
   * reference to the first GameNode in this list
   */
  private GameNode list;

  /**
   * initializes list to start out empty
   */
  public GameList() {
    this.list = null;
  }

  /**
   * adds the new node to the end of this list
   * 
   * @param newNode the new node
   */
  public void addNode(GameNode newNode) {
    GameNode pointer = this.list;
    if (pointer == null)
      this.list = newNode;
    else {
      while (pointer.getNext() != null) {
        pointer = pointer.getNext();
      }
      pointer.setNext(newNode);
    }
  }

  /**
   * only returns true when this list contains a node with the specified number
   * 
   * @param number the specified number
   * @return true if this list contains a node with the specified number, false otherwise
   */
  public boolean contains(int number) {
    GameNode pointer = this.list;
    while (pointer != null) {
      if (pointer.getNumber() == number)
        return true;
      pointer = pointer.getNext();
    }
    return false;
  }

  /**
   * returns a string with each number in the list separated by arrows, and ending with arrow + "END"
   * 
   * @return the string representation of the list
   */
  @Override
  public String toString() {
    String s = "";
    GameNode pointer = this.list;
    while (pointer != null) {
      s += pointer.getNumber() + " -> ";
      pointer = pointer.getNext();
    }
    s += "END";
    return s;
  }

  /**
   * scan through this list searching for the first occurrence of a node with the specified number.
   * After finding a node with that number, it calls the applyOperator method on that GameNode,
   * passing along the specified operator object reference. If the node that applyOperator() is
   * called on happens to be the last node in the list, then applyOperator() will throw a
   * NullPointerException. Did not handle the exception in this method since it will be handle in
   * the calling method or prevent it
   * 
   * @param number   the number we want to operate
   * @param operator the operator we want to use
   */
  public void applyOperatorToNumber(int number, GameOperator operator) {
    GameNode pointer = this.list;
    while (pointer != null) {
      if (pointer.getNumber() == number) {
        pointer.applyOperator(operator);
        break;
      }
      pointer = pointer.getNext();
    }
  }
}
