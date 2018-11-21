//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: ASCII Art
// Files: Canvas.java AsciiTest.java DrawingChange.java AsciiArt.java DrawingStack.java DrawingStackIterator.java 
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
/**
 * AsciiArt.java
 * 
 * @author Merle Zhang
 * @date 11.7.18
 */
import java.util.Scanner;

public class AsciiArt {
  /**
   * The canvas
   */
  private static Canvas canvas;

  /**
   * Print the menu
   */
  public static void printMenu() {
    System.out.println("======== MENU ========" + System.lineSeparator() + "[1] Create a new canvas"
        + System.lineSeparator() + "[2] Draw a character:" + System.lineSeparator()
        + "[3] Undo drawing" + System.lineSeparator() + "[4] Redo drawing" + System.lineSeparator()
        + "[5] Show current canvas" + System.lineSeparator() + "[6] Show drawing history"
        + System.lineSeparator() + "[7] Exit");
  }

  /**
   * Process each input command, also verify the validity of input
   * 
   * @param input the first input of each operation
   * @param scr   the Scanner object
   * @return true if program is keep running, false if user want to quit
   */
  public static boolean processInput(String input, Scanner scr) {
    int option; // user's option of command

    // NOTE: Though this part have verify the validity of input, I still put them with the
    // processing of
    // input because they all happened in one tern of operation

    // Parse input to int
    try {
      option = Integer.parseInt(input);
    } catch (NumberFormatException e) { // if input is not integer
      System.out.println("WARNING: invalid input. Please enter an integer");
      return true;
    }

    // check if user want to draw before create a canvas
    if (option > 1 && option < 7 && canvas == null) {
      System.out.println("WARNING: invalid operation. You need create a canvas before draw on it");
    }

    // process each command case
    switch (option) {

      case 1:
        try {
          canvas = new Canvas(Integer.parseInt(prompt("Width ", scr)),
              Integer.parseInt(prompt("Height ", scr)));
        } catch (NumberFormatException e) { // if not integer
          System.out.println("WARNING: invalid input. Please enter integers for width and height");
          return true;
        } catch (IllegalArgumentException e) { // throw from Canvas constructor
          System.out.println("WARNING: invalid input. Width and height should be positive integer");
          return true;
        }
        break;

      case 2:
        try {
          canvas.draw(Integer.parseInt(prompt("Row ", scr)), Integer.parseInt(prompt("Col ", scr)),
              prompt("Character ", scr).charAt(0));
        } catch (NumberFormatException e) { // if not integer
          System.out.println("WARNING: invalid input. Please enter integers for row and col");
          return true;
        } catch (IllegalArgumentException e) { // if invalid position
          System.out
              .println("WARNING: invalid position. Please enter a position in the range of canvas");
          return true;
        } catch (StringIndexOutOfBoundsException e) { // if not enter anything for character
          System.out.println("Please enter a character for your draw");
          return true;
        }
        break;

      case 3:
        if (!canvas.undo())
          System.out.println("Nothing to undo");
        break;

      case 4:
        if (!canvas.redo())
          System.out.println("Nothing to redo");
        break;

      case 5:
        canvas.printDrawing();
        break;

      case 6:
        canvas.printHistory();
        break;

      case 7:
        return false;

      default:
        System.out.println("Please enter an integer in 1 - 7 inclusively");
    }
    return true;
  }

  /**
   * Method to prompt and get input
   * 
   * @param msg the prompt message
   * @param scr the scanner object
   * @return user input
   */
  public static String prompt(String msg, Scanner scr) {
    System.out.print(msg + "> ");
    String input = scr.nextLine().trim();
    return input;
  }

  /**
   * Driver method of whole program
   */
  public static void driver() {
    Scanner scr = new Scanner(System.in);
    boolean flag = true;
    while (flag) {
      printMenu();
      flag = processInput(prompt("", scr), scr);
    }
    System.out.println("Bye!");
  }

  /**
   * The main method
   * 
   * @param args arguments
   */
  public static void main(String[] args) {
    driver();
  }
}
