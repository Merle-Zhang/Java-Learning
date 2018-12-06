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
 * CustomProcess.java
 * 
 * @author Merle Zhang
 * @date 12.5.18
 */

/**
 * The class represents the type for the processes.
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class CustomProcess implements Comparable<CustomProcess> {

  /**
   * Stores the id to be assigned to the next process to be created
   */
  private static int nextProcessId = 1;

  /**
   * Unique identifier for this process
   */
  private final int PROCESS_ID;

  /**
   * Time required by this process for CPU execution
   */
  private int burstTime;

  /**
   * Constructor creates a new instance of CustomProcess with the given burstTime, and PROCESS_ID
   * from nextProcessId
   * 
   * @param burstTime The given burstTime
   */
  public CustomProcess(int burstTime) {
    this.PROCESS_ID = nextProcessId++;
    this.burstTime = burstTime;
  }

  /**
   * Override compareTo, that return negative if this CustomProcess has higher priority, 0 if this
   * and other CustomProcess have the same priority, positive if this CustomProcess has lower
   * priority
   * 
   * @param other The other CustomPorcess
   * @return negative integer if this CustomProcess has higher priority, 0 if this and other
   *         CustomProcess have the same priority, positive integer if this CustomProcess has lower
   *         priority
   */
  @Override
  public int compareTo(CustomProcess other) {
    int timeDiff = this.burstTime - other.burstTime;
    return timeDiff != 0 ? timeDiff : this.PROCESS_ID - other.PROCESS_ID;
  }

  /**
   * The getter of PROCESS_ID
   * 
   * @return This PROCESS_ID
   */
  public int getProcessId() {
    return this.PROCESS_ID;
  }

  /**
   * The getter of BurstTime
   * 
   * @return This BurstTime
   */
  public int getBurstTime() {
    return this.burstTime;
  }

}
