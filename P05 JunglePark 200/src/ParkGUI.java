//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: JunglePark 2000
// Files: JunglePark.java, ParkGUI.java, Animal.java, Tiger.java, Deer.java, Button.java,
// AddAnimalButton.java, ClearButton.java, JungleParkTests.java
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
 * Interface ParkGUI
 * 
 * This interface represents every GUI component in JunglePark
 * 
 * @author Merle Zhang
 * @version 1.0
 *
 */
public interface ParkGUI {
  /**
   * draws a ParkGUI object (either an animal or a button) to the display window
   */
  public void draw();

  /**
   * called each time the mouse is Pressed
   */
  public void mousePressed();

  /**
   * called each time the mouse is Pressed
   */
  public void mouseReleased();

  /**
   * checks whether the mouse is over a ParkGUI object
   * 
   * @return true if mouse is over this object, false otherwise
   */
  public boolean isMouseOver();

}
