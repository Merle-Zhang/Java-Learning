import java.util.Random;

/**
 * Class GameNode
 * <p>
 * The GameNode class represents a single number within this linked list
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class GameNode {

  /**
   * the number held within this node
   */
  private int number;

  /**
   * the next GameNode in the list, or null for the last node
   */
  private GameNode next;

  /**
   * initializes number to random 1-9 value, and next to null
   * 
   * @param rng the Random object
   */
  public GameNode(Random rng) {
    // number should be 1-9 inclusive, so it cannot be 0
    this.number = rng.nextInt(9) + 1;
    this.next = null;
  }

  /**
   * accessor for the number field
   * 
   * @return the number held within this node
   */
  public int getNumber() {
    return this.number;
  }

  /**
   * accessor for the next field
   * 
   * @return the next field
   */
  public GameNode getNext() {
    return next;
  }

  /**
   * mutator for the next field
   * 
   * @param next the next field
   */
  public void setNext(GameNode next) {
    this.next = next;
  }

  /**
   * change nodes number and next fields. The new number for this node is calculated by applying the
   * provided operator to this node number (the first operand), and the next node number (the
   * second operand). The new next reference for this node should be copied from the next reference
   * of the following node in the list so that the following node is effectively removed from the
   * list. When this method is called on the node that is at the end of a list, then a
   * NullPointerException may be thrown to indicate this problem.
   * 
   * @param operator the operator that will be used
   */
  public void applyOperator(GameOperator operator) {
    this.number = operator.apply(this.number, this.next.number);
    this.next = this.next.next;
  }
}
