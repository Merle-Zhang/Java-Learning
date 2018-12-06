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
 * WaitingQueueADT.java
 * 
 * @author Merle Zhang
 * @date 12.5.18
 */

/**
 * Abstract Data Type that represents the pattern for ready processes waiting list
 * 
 * @author Merle Zhang
 * @version 1.0
 * @param <T> The type of object in the queue
 * @param <T> The type of object compared to
 */
public interface WaitingQueueADT<T extends Comparable<T>> {

  /**
   * Inserts a newObject in the priority queue
   * 
   * @param newObject The newObject inserted
   */
  public void enqueue(T newObject);

  /**
   * Removes and returns the item with the highest priority
   * 
   * @return The item with the highest priority
   */
  public T dequeue();

  /**
   * Returns without removing the item with the highest priority
   * 
   * @return The item with the highest priority
   */
  public T peek();

  /**
   * Returns size of the waiting queue
   * 
   * @return The size of the waiting queue
   */
  public int size();

  /**
   * Checks if the waiting queue is empty
   * 
   * @return True if the waiting queue is empty; false otherwise
   */
  public boolean isEmpty();
}
