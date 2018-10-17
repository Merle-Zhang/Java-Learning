
/**
 * 
 * @author mikez
 * @version
 */
public class Deer extends Animal {
  private static final int SCAN_RANGE = 175; // scan range area to check for a threat in the
                                             // neighborhood
  private static final String IMAGE_FILE_NAME = "images/deer.png";
  private static int nextID = 1; // class variable that represents the identifier of the next deer
                                 // to be created

  private static final String TYPE = "DR"; // A String that represents the deer type
  private final int id; // Deer's id: positive number that represents the order of the deer


  // Constructor that creates a new Deer object positioned at a random position of the display
  // window
  public Deer(JunglePark processing) {
    // Set Deer drawing parameters
    super(processing, IMAGE_FILE_NAME);

    // Set Deer identification fields
    id = nextID;
    this.label = TYPE + id; // String that identifies the current tiger
    nextID++;
  }

  // Checks if there is a threat (a Tiger for instance) at the neighborhood
  // scanRange is an integer that represents the range of the area to be scanned around the animal
  public boolean scanForThreat(int scanRange) {
    for (ParkGUI itm : super.processing.listGUI) {
      if (itm instanceof Tiger && this.distance((Animal) itm) <= scanRange) {
        return true;
      }
    }
    return false;
  }


  // Defines the behavior of a Deer object in the Jungle park
  @Override
  public void action() {

  }
}
