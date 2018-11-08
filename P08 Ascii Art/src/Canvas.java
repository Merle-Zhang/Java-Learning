/**
 * Canvas.java
 * 
 * @author Merle Zhang
 * @date 11.7.18
 */


/**
 * Class representing an ASCII-art image
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Canvas {

  /**
   * width of the canvas
   */
  private final int width;

  /**
   * height of the canvas
   */
  private final int height;

  /**
   * 2D character array to store the drawing
   */
  private char[][] drawingArray;

  /**
   * store previous changes for undo
   */
  private final DrawingStack undoStack;

  /**
   * store undone changes for redo
   */
  private final DrawingStack redoStack;

  /**
   * Constructor of class Canvas. Throws IllegalArgumentException if width or height is 0 or
   * negative. A Canvas is initially blank (use the space ' ' character)
   *
   * @param width  width of the canvas
   * @param height height of the canvas
   */
  public Canvas(int width, int height) {
    if (width <= 0 || height <= 0)
      throw new IllegalArgumentException();
    this.width = width;
    this.height = height;
    drawingArray = new char[height][width];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        drawingArray[i][j] = ' ';
      }
    }
    undoStack = new DrawingStack();
    redoStack = new DrawingStack();
  }

  /**
   * Draw a character at the given position. This method should throw an IllegalArgumentException if
   * the drawing position is outside the canvas. If that position is already marked with a different
   * character, overwrite it. After making a new change, add a matching DrawingChange to the
   * undoStack so that we can undo if needed. After making a new change, the redoStack should be
   * empty.
   * 
   * @param row the row we want to change
   * @param col the column we want to change
   * @param c   the character we want to draw
   */
  public void draw(int row, int col, char c) {
    if (row < 0 || row >= this.height || col < 0 || col >= this.width)
      throw new IllegalArgumentException();
    char prev = drawingArray[row][col];
    drawingArray[row][col] = c;
    undoStack.push(new DrawingChange(col, row, prev, c));
    while (!redoStack.isEmpty())
      redoStack.pop();
  }

  /**
   * Undo the most recent drawing change. Return true if successful. False otherwise. An undone
   * DrawingChange should be added to the redoStack so that we can redo if needed.
   * 
   * @return true if successful; false otherwise
   */
  public boolean undo() {
    if (undoStack.isEmpty())
      return false;
    DrawingChange recent = undoStack.pop();
    draw(recent.y, recent.x, recent.prevChar);
    redoStack.push(recent);
    return true;
  }

  /**
   * Redo the most recent undone drawing change. Return true if successful. False otherwise. A
   * redone DrawingChange should be added (back) to the undoStack so that we can undo again if
   * needed.
   * 
   * @return true if successful; false otherwise
   */
  public boolean redo() {
    if (redoStack.isEmpty())
      return false;
    DrawingChange recent = redoStack.pop();
    draw(recent.y, recent.x, recent.newChar);
    undoStack.push(recent);
    return false;
  }

  /**
   * Return a printable string version of the Canvas
   * 
   * @return a printable string version of the Canvas
   */
  public String toString() {
    String str = "";
    for (char[] row : drawingArray) {
      for (char pos : row) {
        if (pos == ' ')
          str += "_";
        else
          str += pos;
      }
      str += System.lineSeparator();
    }
    return str;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
