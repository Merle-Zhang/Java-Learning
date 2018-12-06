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
