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

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
