/**
 * Class ClearButton
 * 
 * This a class for clear button extends Button class
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class ClearButton extends Button {
  /**
   * Constructor of class ClearButton with parameters of coordinates and the JunglePark
   * 
   * @param x          the x coordinate of the button
   * @param y          the y coordinate of the button
   * @param processing the reference of the JunglePark
   */
  public ClearButton(float x, float y, JunglePark park) {
    super(x, y, park);
    this.label = "Clear Park";
  }

  /**
   * Callback method called each time the user presses the mouse
   */
  @Override
  public void mousePressed() {
    if (isMouseOver()) {
      processing.clear();
    }
  }
}
