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
 * This class represents a Tiger in the JunglePark application
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Tiger extends Animal {
  /**
   * range dimension for scanning the neighborhood for food
   */
  private static final int SCAN_RANGE = 100;

  /**
   * name of the picture
   */
  private static final String IMAGE_FILE_NAME = "images/tiger.png";

  /**
   * class variable that represents the identifier of the next tiger to be created
   */
  private static int nextID = 1;

  // Tiger's identification fields

  /**
   * A String that represents the tiger type
   */
  private static final String TYPE = "TGR";

  /**
   * Tiger's id: positive number that represents the order of the tiger
   */
  private final int id;

  /**
   * Number of Deers that the current tiger has eaten so far
   */
  private int deerEatenCount;

  /**
   * Creates a new Tiger object positioned at a random position of the display window
   * 
   * @param processing PApplet object that represents the display window
   */
  public Tiger(JunglePark processing) {
    // Set Tiger drawing parameters
    super(processing, IMAGE_FILE_NAME);

    // Set Tiger identification fields
    id = nextID;
    this.label = TYPE + id; // String that identifies the current tiger
    nextID++;
    deerEatenCount = 0;
  }

  /**
   * Accessor for deerEatenCount
   * 
   * @return this.deerEatenCount
   */
  public int getDeerEatenCount() {
    return this.deerEatenCount;
  }

  /**
   * To hop on the food Deer, the tiger moves forward the position of food, and eats it.
   * 
   * @param food the food to hop and eat
   */
  public void hop(Deer food) {
    this.mouseReleased();
    this.setPositionX(food.getPositionX());
    this.setPositionY(food.getPositionY());
    for (int i = 0; i < processing.listGUI.size(); i++) {
      if (processing.listGUI.get(i) == food) {
        processing.listGUI.remove(i);
        break;
      }
    }
    deerEatenCount++;
  }

  /**
   * helper method for hop to find and hop food
   */
  public void searchnHop() {
    // Not sure to remove the smallest index one or the closest one, go with the closest one
    int i = 0;
    double closestIns = 0;
    Deer closestDr = null;
    for (; i < processing.listGUI.size(); i++) { // get the first deer within the range
      if (processing.listGUI.get(i) instanceof Deer
          && this.distance((Animal) processing.listGUI.get(i)) <= SCAN_RANGE) {
        closestIns = this.distance((Animal) processing.listGUI.get(i));
        closestDr = (Deer) this.processing.listGUI.get(i);
        break;
      }
    }
    for (; i < processing.listGUI.size(); i++) { // get the closest deer
      if (processing.listGUI.get(i) instanceof Deer
          && this.distance((Animal) processing.listGUI.get(i)) < closestIns) {
        closestIns = this.distance((Animal) processing.listGUI.get(i));
        closestDr = (Deer) this.processing.listGUI.get(i);
      }
    }
    if (closestDr != null) { // in case no deer in the range
      hop(closestDr);
    }
  }

  /**
   * Tiger's behavior in the Jungle Park Scans for food at the neighborhood of the current tiger. If
   * the Tiger founds any deer at its proximity, it hops on it, and eats it
   */
  @Override
  public void action() {
    searchnHop();
    if (deerEatenCount > 0)
      displayDeerEatenCount(); // display deerEatenCount
  }

  /**
   * Displays the number of eaten deers if any on the top of the tiger image
   */
  public void displayDeerEatenCount() {
    this.processing.fill(0); // specify font color: black
    // display deerEatenCount on the top of the Tiger's image
    this.processing.text(deerEatenCount, this.getPositionX(),
        this.getPositionY() - this.image.height / 2 - 4);
  }
}
