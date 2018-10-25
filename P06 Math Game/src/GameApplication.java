//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Math Game
// Files: GameApplication.java, GameList.java, GameNode.java, GameTests.java
// Course: Comp Sci 300, Fall, 2018
//
// Author: Merle Zhang
// Email: xzhang2229@wisc.edu
// Lecturer's Name: Alexander Brooks
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: NONE
// Partner Email: NONE
// Partner Lecturer's Name: NONE
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
import java.security.AllPermission;
import java.util.Random;
import java.util.Scanner;

/**
 * Class GameApplicatoin
 * <p>
 * The class that contains the game
 * @author Merle Zhang
 * @version 1.0
 */
public class GameApplication {

  /**
   * the Random object
   */
  public static Random rnm = new Random();

  /**
   * main function
   * @param args list of arguments
   */
  public static void main(String[] args) {
    int target = rnm.nextInt(90) + 10; // target goal between 10-99 inclusive
    GameList list = new GameList(); // create a list with 7 randomly numbered (1-9 inclusive)
    for (int i = 0; i < 7; i++) {
      list.addNode(new GameNode(rnm));
    }
    Scanner sc = new Scanner(System.in);
    String input = ""; // store user input
    int moves = 0; // store number of moves
    int inputNum; // store input number
    char inputChar; // store input operator

    while (true) {
      System.out.print("Goal: " + target + " Moves Taken: " + moves + "\n" + "Puzzle: " + list
          + "\n" + "Number and Operation " + GameOperator.ALL_OPERATORS + " to Apply: ");
      input = sc.nextLine().trim(); // remove spaces in front and end

      if (input.toLowerCase().equals("quit"))
        break; // end the program

      inputNum = 0;
      inputChar = input.charAt(input.length() - 1);

      // test if input number is valid
      try {
        inputNum = Integer.parseInt(input.substring(0, input.length() - 1));
      } catch (NumberFormatException e) {
        System.out
            .println("WARNING: input number is not valid, please type a number and a operator");
        System.out.println();
        continue;
      }

      // test input number is in the list
      if (!list.contains(inputNum)) {
        System.out.println("WARNING: input number is not in the list, please try again");
        System.out.println();
        continue;
      }

      // test input operator is valid
      if (GameOperator.getFromChar(inputChar) == null) {
        System.out.println("WARNING: input operator is not valid, please try again");
        System.out.println();
        continue;
      }

      list.applyOperatorToNumber(inputNum, GameOperator.getFromChar(inputChar));
      list.addNode(new GameNode(rnm));
      moves++;
      System.out.println();
      
      if (list.contains(target)) {
        System.out.println("Congratulations, you won in " + moves + " moves.\n"
            + "Solution: " + list);
        break;
      }
    }
  }
}
