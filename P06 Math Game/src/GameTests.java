import java.util.Random;

public class GameTests {

  /**
   * test GameNode's getNumber() and getNext()
   * 
   * @return true if number is between -1 and 10 exclusively, and next is null; false otherwise
   */
  public static boolean testNodeGetNumbernGetNext() {
    GameNode first = new GameNode(new Random());
    return first.getNumber() > -1 && first.getNumber() < 10 && first.getNext() == null;
  }

  /**
   * test GameNode's applyOperator()
   * 
   * @return true if next is null; false otherwise
   */
  public static boolean testNodeApplyOperator() {
    GameNode first = new GameNode(new Random());
    first.setNext(new GameNode(new Random()));
    first.applyOperator(GameOperator.getFromChar('+'));
    return first.getNext() == null;
  }

  /**
   * test GameList's addNode() and toString()
   * 
   * @return true if the toString is equal to the correct String representation
   */
  public static boolean testListAddNodenToString() {
    // prepare testing sample
    GameNode first = new GameNode(new Random());
    GameNode second = new GameNode(new Random());
    GameList list = new GameList();

    // test start
    list.addNode(first);
    list.addNode(second);
    return list.toString().equals(first.getNumber() + " -> " + second.getNumber() + " -> END");
  }

  /**
   * test GameList's applyOperatorToNumber()
   * 
   * @return true if two numbers are added together correctly, false otherwise
   */
  public static boolean testListApplyOperatorToNumber() {
    // prepare testing sample
    GameNode first = new GameNode(new Random());
    GameNode second = new GameNode(new Random());
    GameList list = new GameList();
    list.addNode(first);
    list.addNode(second);
    int firstInt = first.getNumber();
    int secondInt = second.getNumber();

    // test start
    list.applyOperatorToNumber(firstInt, GameOperator.getFromChar('+'));
    return list.toString().equals((firstInt + secondInt) + " -> END");
  }

  public static void main(String[] args) {
    System.out.println("testNodeGetNumbernGetNext() " + testNodeGetNumbernGetNext());
    System.out.println("testNodeApplyOperator() " + testNodeApplyOperator());
    System.out.println("testListAddNodenToString() " + testListAddNodenToString());
    System.out.println("testListApplyOperatorToNumber() " + testListApplyOperatorToNumber());
  }

}
