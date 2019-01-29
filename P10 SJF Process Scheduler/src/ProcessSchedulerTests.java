/**
 * ProcessSchedulerTests.java
 * 
 * @author Merle Zhang
 * @date 12.5.18
 */

/**
 * The test class for ProcessScheduler
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class ProcessSchedulerTests {

  /**
   * checks the correctness of the enqueue operation implemented in the CustomProcessQueue class
   * 
   * @return True if work correctly, false otherwise
   */
  public static boolean testEnqueueCustomProcessQueue() {
    try {
      CustomProcessQueue queue = new CustomProcessQueue();
      queue.enqueue(new CustomProcess(5));
      queue.enqueue(new CustomProcess(3));
      queue.enqueue(new CustomProcess(3));
      queue.enqueue(new CustomProcess(7));
      CustomProcess[] heap = queue.getHeap();
      return heap[1].compareTo(heap[2]) <= 0 && heap[1].compareTo(heap[3]) <= 0
          && heap[2].compareTo(heap[4]) <= 0;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Checks the correctness of the dequeue operation implemented in the CustomProcessQueue class
   * 
   * @return True if work correctly, false otherwise
   */
  public static boolean testDequeueCustomProcessQueue() {
    try {
      CustomProcessQueue queue = new CustomProcessQueue();
      queue.enqueue(new CustomProcess(5));
      queue.enqueue(new CustomProcess(3));
      queue.enqueue(new CustomProcess(3));
      queue.enqueue(new CustomProcess(7));
      CustomProcess[] heap = queue.getHeap();
      return queue.dequeue().getProcessId() == 6 && queue.dequeue().getProcessId() == 7
          && queue.dequeue().getProcessId() == 5 && queue.dequeue().getProcessId() == 8
          && heap[1] == null && heap[2] == null;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Test other method of CustomProcessQueue
   * 
   * @return True if work correctly, false otherwise
   */
  public static boolean testCustomProcessQueueOthers() {
    try {
      CustomProcessQueue queue = new CustomProcessQueue();
      queue.enqueue(new CustomProcess(5));
      return queue.size() == 1 && queue.peek().getProcessId() == queue.dequeue().getProcessId()
          && queue.size() == 0 && queue.isEmpty() == true;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Test expand method of CustomProcessQueue
   * 
   * @return True if work correctly, false otherwise
   */
  public static boolean testCustomProcessQueueExpand() {
    try {
      CustomProcessQueue queue = new CustomProcessQueue();
      for (int i = 0; i < CustomProcessQueue.getInitialCapacity(); i++) {
        queue.enqueue(new CustomProcess(i));
      }
      CustomProcess[] heap = queue.getHeap();
      return heap.length == 40;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Test ProcessScheduler Class
   * 
   * @return True if work correctly, false otherwise
   */
  public static boolean testProcessScheduler() {
    ProcessScheduler ps = new ProcessScheduler();
    ps.scheduleProcess(new CustomProcess(5));
    ps.scheduleProcess(new CustomProcess(10));
    ps.scheduleProcess(new CustomProcess(3));
    ps.scheduleProcess(new CustomProcess(3));
    return ps.run()
        .equals("Starting 4 processes\n\n" + "Time 0 : Process ID 32 Starting.\n"
            + "Time 3: Process ID 32 Completed.\n" + "Time 3 : Process ID 33 Starting.\n"
            + "Time 6: Process ID 33 Completed.\n" + "Time 6 : Process ID 30 Starting.\n"
            + "Time 11: Process ID 30 Completed.\n" + "Time 11 : Process ID 31 Starting.\n"
            + "Time 21: Process ID 31 Completed.\n"
            + "\nTime 21: All scheduled processes completed.\n");
  }

  /**
   * The main method
   * 
   * @param args Arguments
   */
  public static void main(String[] args) {
    System.out.println("testEnqueueCustomProcessQueue: " + testEnqueueCustomProcessQueue());
    System.out.println("testDequeueCustomProcessQueue: " + testDequeueCustomProcessQueue());
    System.out.println("testCustomProcessQueueOthers: " + testCustomProcessQueueOthers());
    System.out.println("testCustomProcessQueueExpand: " + testCustomProcessQueueExpand());
    System.out.println("testProcessScheduler: " + testProcessScheduler());
  }

}
