/**
 * Badger.java
 * 
 * @author Merle Zhang
 * @date 11.28.18
 */


/**
 * This class represents a Badger which is designed to live in a Sett. Each Badger object represents
 * a single node within a BST (known as a Sett).
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class Badger {

  /**
   * This badger's lower left neighbor
   */
  private Badger leftLowerNeighbor;

  /**
   * This badger's lower right neighbor.
   */
  private Badger rightLowerNeighbor;

  /**
   * The size of this badger.
   */
  private int size;

  /**
   * Creates a new Badger with specified size.
   * 
   * @param size The size of the newly constructed Badger object.
   */
  public Badger(int size) {
    this.size = size;
  }

  /**
   * Retrieves neighboring badger that is smaller than this one.
   * 
   * @return The left lower neighbor of current badger.
   */
  public Badger getLeftLowerNeighbor() {
    return this.leftLowerNeighbor;
  }

  /**
   * Changes this badger's lower left neighbor.
   * 
   * @param badger The new left lower neighbor of current badger.
   */
  public void setLeftLowerNeighbor(Badger badger) {
    this.leftLowerNeighbor = badger;
  }

  /**
   * Retrieves neighboring badger that is larger than this one.
   * 
   * @return The right lower neighbor of current badger.
   */
  public Badger getRightLowerNeighbor() {
    return this.rightLowerNeighbor;
  }

  /**
   * Changes this badger's lower right neighbor.
   * 
   * @param badger The new right lower neighbor of current badger.
   */
  public void setRightLowerNeighbor(Badger badger) {
    this.rightLowerNeighbor = badger;
  }

  /**
   * Retrieves the size of this badger.
   * 
   * @return The size of current badger.
   */
  public int getSize() {
    return this.size;
  }

}
