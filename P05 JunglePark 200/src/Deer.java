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
 * This class represents a Deer in the JunglePark application
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Deer extends Animal {
  /**
   * scan range area to check for a threat in the neighborhood
   */
  private static final int SCAN_RANGE = 175;

  /**
   * name of the picture
   */
  private static final String IMAGE_FILE_NAME = "images/deer.png";

  /**
   * class variable that represents the identifier of the next deer to be created
   */
  private static int nextID = 1;

  /**
   * A String that represents the deer type
   */
  private static final String TYPE = "DR";

  /**
   * Deer's id: positive number that represents the order of the deer
   */
  private final int id;

  /**
   * Constructor that creates a new Deer object positioned at a random position of the display
   * window
   * 
   * @param processing the JunglePark
   */
  public Deer(JunglePark processing) {
    // Set Deer drawing parameters
    super(processing, IMAGE_FILE_NAME);

    // Set Deer identification fields
    id = nextID;
    this.label = TYPE + id; // String that identifies the current tiger
    nextID++;
  }

  /**
   * Checks if there is a threat (a Tiger for instance) at the neighborhood scanRange is an integer
   * that represents the range of the area to be scanned around the animal
   * 
   * @param scanRange the int range to scan
   * @return true if there is a threat, false otherwise
   */
  public boolean scanForThreat(int scanRange) {
    for (ParkGUI itm : this.processing.listGUI) {
      if (itm instanceof Tiger && this.distance((Animal) itm) <= scanRange) {
        return true;
      }
    }
    return false;
  }

  /**
   * Defines the behavior of a Deer object in the Jungle park
   */
  @Override
  public void action() {
    if (this.scanForThreat(SCAN_RANGE)) {
      this.processing.fill(0); // specify font color: black
      this.processing.text("THREAT!", this.getPositionX(),
          this.getPositionY() - this.image.height / 2 - 4);
    }
  }
}
