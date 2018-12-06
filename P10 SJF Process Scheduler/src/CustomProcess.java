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
