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
 * Class GameTests
 * <p>
 * use to test the nodes and list
 * @author Merle Zhang
 * @version 1.0
 */
public class GameTests {

  /**
   * test GameNode's getNumber() and getNext()
   * 
   * @return true if number is between -1 and 10 exclusively, and next is null; false otherwise
   */
  public static boolean testNodeGetNumbernGetNext() {
    GameNode first = new GameNode(new Random());
    return first.getNumber() > -1 && first.getNumber() < 10 && first.getNext() == null;
  }

  /**
   * test GameNode's applyOperator()
   * 
   * @return true if next is null; false otherwise
   */
  public static boolean testNodeApplyOperator() {
    GameNode first = new GameNode(new Random());
    first.setNext(new GameNode(new Random()));
    first.applyOperator(GameOperator.getFromChar('+'));
    return first.getNext() == null;
  }

  /**
   * test GameList's addNode() and toString()
   * 
   * @return true if the toString is equal to the correct String representation
   */
  public static boolean testListAddNodenToString() {
    // prepare testing sample
    GameNode first = new GameNode(new Random());
    GameNode second = new GameNode(new Random());
    GameList list = new GameList();

    // test start
    list.addNode(first);
    list.addNode(second);
    return list.toString().equals(first.getNumber() + " -> " + second.getNumber() + " -> END");
  }

  /**
   * test GameList's applyOperatorToNumber()
   * 
   * @return true if two numbers are added together correctly, false otherwise
   */
  public static boolean testListApplyOperatorToNumber() {
    // prepare testing sample
    GameNode first = new GameNode(new Random());
    GameNode second = new GameNode(new Random());
    GameList list = new GameList();
    list.addNode(first);
    list.addNode(second);
    int firstInt = first.getNumber();
    int secondInt = second.getNumber();

    // test start
    list.applyOperatorToNumber(firstInt, GameOperator.getFromChar('+'));
    return list.toString().equals((firstInt + secondInt) + " -> END");
  }

  /**
   * the main method
   * @param args the arguments list
   */
  public static void main(String[] args) {
    System.out.println("testNodeGetNumbernGetNext() " + testNodeGetNumbernGetNext());
    System.out.println("testNodeApplyOperator() " + testNodeApplyOperator());
    System.out.println("testListAddNodenToString() " + testListAddNodenToString());
    System.out.println("testListApplyOperatorToNumber() " + testListApplyOperatorToNumber());
  }

}
