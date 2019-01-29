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
