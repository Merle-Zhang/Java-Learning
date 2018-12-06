//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: ProcessScheduler
// Files: ProcessScheduler.java WaitingQueueADT.java CustomProcess.java CustomProcessQueue.java 
//          ProcessSchedulerTests.java
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
 * ProcessScheduler.java
 * 
 * @author Merle Zhang
 * @date 12.5.18
 */

import java.util.Scanner;

/**
 * The Process Scheduler
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class ProcessScheduler {

  /**
   * Stores the current time after the last run
   */
  private int currentTime;

  /**
   * Stores the number of processes run so far
   */
  private int numProcessesRun;

  /**
   * This processing unit's custom process queue
   */
  private CustomProcessQueue queue;

  /**
   * A no-argument constructor that sets up the CustomProcessQueue queue, and initializes both
   * currentTime and numProcessRun to zero
   */
  public ProcessScheduler() {
    this.queue = new CustomProcessQueue();
    this.currentTime = 0;
    this.numProcessesRun = 0;
  }

  /**
   * Enqueue the given process in the CustomProcessQueue queue.
   * 
   * @param process The given process
   */
  public void scheduleProcess(CustomProcess process) {
    queue.enqueue(process);
  }

  /**
   * Start running the ready processes already scheduled in the queue according to the SJF
   * scheduling policy. This method returns when all the scheduled processes are run and the queue
   * is empty. It returns a String that represents the log of one run operation.
   * 
   * @return String that represents the log of one run operation
   */
  public String run() {
    String retn = "";
    if (queue.size() == 0 || queue.size() == 1)
      retn += "Starting " + queue.size() + " process\n\n";
    else
      retn += "Starting " + queue.size() + " processes\n\n";
    while (!queue.isEmpty()) {
      retn += "Time " + this.currentTime + " : Process ID " + queue.peek().getProcessId()
          + " Starting.\n";
      this.currentTime += queue.peek().getBurstTime();
      retn += "Time " + this.currentTime + ": Process ID " + queue.dequeue().getProcessId()
          + " Completed.\n";
      this.numProcessesRun++;
    }
    retn += "\nTime " + this.currentTime + ": All scheduled processes completed.\n";
    return retn;

  }

  /**
   * The main method
   * 
   * @param args arguments
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ProcessScheduler psr = new ProcessScheduler();
    // I split functions into three parts
    // start()
    // -- processInput()
    // -- printReference()
    start(sc, psr);
    sc.close();
  }

  /**
   * Start the program
   * 
   * @param sc  Scanner
   * @param psr ProcessScheduler
   */
  public static void start(Scanner sc, ProcessScheduler psr) {
    System.out.println("==========   Welcome to the SJF Process Scheduler App   ========\n");
    String input;
    boolean exit = false;
    while (!exit) {
      printReference();
      input = sc.nextLine();
      exit = processInput(input, psr);
    }
    System.out.println(psr.numProcessesRun + " processes run in " + psr.currentTime
        + " units of time!\n" + "Thank you for using our scheduler!\n" + "Goodbye!\n");
  }

  /**
   * Process the input
   * 
   * @param input The input string
   * @param psr   The ProcessScheduler
   * @return true if exit, false otherwise
   */
  public static boolean processInput(String input, ProcessScheduler psr) {
    String[] in = input.trim().split(" ");

    // case s
    if (in.length == 2 && (in[0].equals("schedule") || in[0].equals("s"))) {
      try {
        int time = Integer.parseInt(in[1]);
        if (time <= 0) {
          System.out.println("WARNING: burst time MUST be greater than 0!\n");
          return false;
        }
        CustomProcess cp = new CustomProcess(time);
        psr.scheduleProcess(cp);
        System.out.println("Process ID " + cp.getProcessId() + " scheduled. Burst Time = "
            + cp.getBurstTime() + "\n");
      } catch (NumberFormatException e) {
        System.out.println("WARNING: burst time MUST be an integer!\n");
        return false;
      }

      // case r
    } else if (in.length == 1 && (in[0].equals("run") || in[0].equals("r"))) {
      System.out.println(psr.run());

      // case q
    } else if (in.length == 1 && (in[0].equals("quit") || in[0].equals("q"))) {
      return true;

    } else {
      System.out.println("WARNING: Please enter a valid command!\n");
    }

    return false;
  }

  /**
   * Print the syntax reference
   */
  public static void printReference() {
    System.out.println("Enter command:\n" + "[schedule <burstTime>] or [s <burstTime>]\n"
        + "[run] or [r]\n" + "[quit] or [q]\n");
  }

}
