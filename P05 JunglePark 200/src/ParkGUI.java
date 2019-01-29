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
