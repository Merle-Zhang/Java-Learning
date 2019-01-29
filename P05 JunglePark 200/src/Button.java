/**
 * Class Button
 * 
 * This a super class for any Button that can be added to a PApplet application This class
 * implements the ParkGUI interface
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Button implements ParkGUI {
  /**
   * Width of the Button
   */
  private static final int WIDTH = 85;

  /**
   * Height of the Button
   */
  private static final int HEIGHT = 32;

  /**
   * PApplet object where the button will be displayed
   */
  protected JunglePark processing;

  /**
   * array storing x and y positions of the Button with respect to the display window
   */
  private float[] position;

  /**
   * text/label that represents the button
   */
  protected String label;

  /**
   * Constructor of class Button with parameters of coordinates and the JunglePark
   * 
   * @param x          the x coordinate of the button
   * @param y          the y coordinate of the button
   * @param processing the reference of the JunglePark
   */
  public Button(float x, float y, JunglePark processing) {
    this.processing = processing;
    this.position = new float[2];
    this.position[0] = x;
    this.position[1] = y;
    this.label = "Button";
  }

  /**
   * Callback method called in an infinite loop. It draws the button's display
   */
  @Override
  public void draw() {
    this.processing.stroke(0);// set line value to black
    if (isMouseOver())
      processing.fill(100); // set the fill color to dark gray if the mouse is over the button
    else
      processing.fill(200); // set the fill color to light gray otherwise
    // draw the button (rectangle with a centered text)
    processing.rect(position[0] - WIDTH / 2.0f, position[1] - HEIGHT / 2.0f,
        position[0] + WIDTH / 2.0f, position[1] + HEIGHT / 2.0f);
    processing.fill(0); // set the fill color to black
    processing.text(label, position[0], position[1]); // display the text of the current button
  }

  /**
   * Callback method called each time the user presses the mouse
   */
  @Override
  public void mousePressed() {
    if (isMouseOver())
      System.out.println("A button was pressed.");
  }

  /**
   * Callback method called each time the mouse is released
   */
  @Override
  public void mouseReleased() {}

  /**
   * Override the inMouseOver in ParkGUI 
   * @return true if mouse is over the button, false otherwise
   */
  @Override
  public boolean isMouseOver() {
    if (this.processing.mouseX > this.position[0] - WIDTH / 2
        && this.processing.mouseX < this.position[0] + WIDTH / 2
        && this.processing.mouseY > this.position[1] - HEIGHT / 2
        && this.processing.mouseY < this.position[1] + HEIGHT / 2)
      return true;
    return false;
  }
}
