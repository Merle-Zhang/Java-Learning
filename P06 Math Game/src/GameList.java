/**
 * Class GameList
 * <p>
 * the list of numbers that the player will be selecting from and modifying
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class GameList {

  /**
   * reference to the first GameNode in this list
   */
  private GameNode list;

  /**
   * initializes list to start out empty
   */
  public GameList() {
    this.list = null;
  }

  /**
   * adds the new node to the end of this list
   * 
   * @param newNode the new node
   */
  public void addNode(GameNode newNode) {
    GameNode pointer = this.list;
    if (pointer == null)
      this.list = newNode;
    else {
      while (pointer.getNext() != null) {
        pointer = pointer.getNext();
      }
      pointer.setNext(newNode);
    }
  }

  /**
   * only returns true when this list contains a node with the specified number
   * 
   * @param number the specified number
   * @return true if this list contains a node with the specified number, false otherwise
   */
  public boolean contains(int number) {
    GameNode pointer = this.list;
    while (pointer != null) {
      if (pointer.getNumber() == number)
        return true;
      pointer = pointer.getNext();
    }
    return false;
  }

  /**
   * returns a string with each number in the list separated by arrows, and ending with arrow + "END"
   * 
   * @return the string representation of the list
   */
  @Override
  public String toString() {
    String s = "";
    GameNode pointer = this.list;
    while (pointer != null) {
      s += pointer.getNumber() + " -> ";
      pointer = pointer.getNext();
    }
    s += "END";
    return s;
  }

  /**
   * scan through this list searching for the first occurrence of a node with the specified number.
   * After finding a node with that number, it calls the applyOperator method on that GameNode,
   * passing along the specified operator object reference. If the node that applyOperator() is
   * called on happens to be the last node in the list, then applyOperator() will throw a
   * NullPointerException. Did not handle the exception in this method since it will be handle in
   * the calling method or prevent it
   * 
   * @param number   the number we want to operate
   * @param operator the operator we want to use
   */
  public void applyOperatorToNumber(int number, GameOperator operator) {
    GameNode pointer = this.list;
    while (pointer != null) {
      if (pointer.getNumber() == number) {
        pointer.applyOperator(operator);
        break;
      }
      pointer = pointer.getNext();
    }
  }
}
