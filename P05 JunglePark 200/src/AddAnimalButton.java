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
