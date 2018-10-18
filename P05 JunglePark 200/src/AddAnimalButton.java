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
 * Class AddAnimalButton
 * 
 * The class represents different button for each animal
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class AddAnimalButton extends Button {
  /**
   * type type of the animal to add
   */
  private String type;

  /**
   * Constructor of class AddAnimalButton with parameters of type, coordinates, the park
   * 
   * @param type the type of the animal to add
   * @param x    the x coordinate of the button
   * @param y    the y coordinate of the button
   * @param park the reference of the park
   */
  public AddAnimalButton(String type, float x, float y, JunglePark park) {
    super(x, y, park);
    this.type = type.toLowerCase();
    this.label = "Add " + type;
  }

  /**
   * Callback method called each time the user presses the mouse
   */
  @Override
  public void mousePressed() {
    if (isMouseOver()) {
      switch (type) {
        case "tiger":
          processing.listGUI.add(new Tiger(processing));
          break;
        case "deer":
          processing.listGUI.add(new Deer(processing));
          break;
      }
    }
  }
}
