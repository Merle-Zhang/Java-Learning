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
    while (!input.equals("quit")) {
      System.out.println("Goal: " + target + " Moves Taken: " + moves + "\n" + "Puzzle: " + list
          + "\n" + "Number and Operation [+, -, x, /, &] to Apply: ");
      input = sc.nextLine().trim();
      if(input.equals("quit"))
        break;
      
    }
  }

}
