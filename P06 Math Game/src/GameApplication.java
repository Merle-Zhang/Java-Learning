import java.util.Random;
import java.util.Scanner;

public class GameApplication {

  public static Random rnm = new Random();

  public static void main(String[] args) {
    int target = rnm.nextInt(90) + 10; // target goal between 10-99 inclusive
    GameList list = new GameList(); // create a list with 7 randomly numbered (1-9 inclusive)
    for (int i = 0; i < 7; i++) {
      list.addNode(new GameNode(rnm));
    }
    Scanner sc = new Scanner(System.in);
    String input = "";
    int moves = 0;
    int inputNum;
    char inputChar;
    while (!input.equals("quit")) {
      System.out.print("Goal: " + target + " Moves Taken: " + moves + "\n" + "Puzzle: " + list
          + "\n" + "Number and Operation [+, -, x, /, &] to Apply: ");
      input = sc.nextLine().trim();
      
      if (input.toLowerCase().equals("quit"))
        break;
      
      inputNum = 0;
      inputChar = input.charAt(input.length() - 1);
      
      try {
        inputNum = Integer.parseInt(input.substring(0, input.length() - 1));
      } catch (NumberFormatException e) {
        System.out
            .println("WARNING: input number is not valid, please type a number and a operator");
        System.out.println();
        continue;
      }
      
      if (!list.contains(inputNum)) {
        System.out.println("WARNING: input number is not in the list, please try again");
        System.out.println();
        continue;
      }
      
      if (GameOperator.getFromChar(inputChar) == null) {
        System.out.println("WARNING: input operator is not valid, please try again");
        System.out.println();
        continue;
      }
      
      list.applyOperatorToNumber(Integer.parseInt(input.substring(0, input.length() - 1)),
          GameOperator.getFromChar(input.charAt(input.length() - 1)));

    }
  }

}
