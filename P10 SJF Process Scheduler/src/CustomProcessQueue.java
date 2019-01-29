/**
 * CustomProcessQueue.java
 * 
 * @author Merle Zhang
 * @date 12.5.18
 */

/**
 * The class represents the CustomProcess Queue
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class CustomProcessQueue implements WaitingQueueADT<CustomProcess> {

  /**
   * The initial capacity of the heap
   */
  private static final int INITIAL_CAPACITY = 20;

  /**
   * Array-based min heap storing the data. This is an oversize array
   */
  private CustomProcess[] heap;

  /**
   * Number of CustomProcesses present in this CustomProcessQueue
   */
  private int size;

  public CustomProcessQueue() {
    this.heap = new CustomProcess[INITIAL_CAPACITY];
    this.size = 0;
  }

  /**
   * PercolateUp the CustomProcess on given index
   * 
   * @param index The given index
   */
  private void minHeapPercolateUp(int index) {
    int parentIndex;
    while (index > 1) {
      parentIndex = index / 2;
      if (heap[index].compareTo(heap[parentIndex]) >= 0)
        return;
      else {
        swap(index, parentIndex);
        index = parentIndex;
      }
    }
  }

  /**
   * PercolateDown the CustomProcess on give index
   * 
   * @param index The give index
   */
  private void minHeapPercolateDown(int index) {
    int childIndex = 2 * index;
    CustomProcess curNode;
    CustomProcess minNode;
    int minIndex;

    while (childIndex < this.size + 1) {
      // Find the min among the node and all the node's children
      curNode = heap[index];
      minNode = curNode;
      minIndex = index;
      for (int i = 0; i < 2 && (i + childIndex) < this.size + 1; i++) {
        if (heap[i + childIndex].compareTo(minNode) < 0) {
          minNode = heap[i + childIndex];
          minIndex = i + childIndex;
        }
      }

      if (minIndex == index)
        return;
      else {
        swap(index, minIndex);
        index = minIndex;
        childIndex = 2 * index;
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void enqueue(CustomProcess newObject) {
    if (size + 1 >= heap.length)
      expand();
    size++;
    heap[size] = newObject;
    minHeapPercolateUp(size);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CustomProcess dequeue() {
    if (this.size == 0)
      return null;
    CustomProcess retn = heap[1];
    heap[1] = heap[size];
    heap[size] = null;
    size--;
    minHeapPercolateDown(1);
    return retn;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CustomProcess peek() {
    return heap[1];
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int size() {
    return this.size;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEmpty() {
    return heap[1] == null;
  }

  /**
   * Swap two CustomProcess
   * 
   * @param a The first one
   * @param b The second one
   */
  private void swap(int a, int b) {
    CustomProcess temp = heap[a];
    heap[a] = heap[b];
    heap[b] = temp;
  }

  /**
   * Expand the heap to twice the size
   */
  private void expand() {
    CustomProcess[] newHeap = new CustomProcess[heap.length * 2];
    for (int i = 0; i < heap.length; i++)
      newHeap[i] = heap[i];
    heap = newHeap;
  }

  /**
   * Getter for heap for test use
   * 
   * @return the Heap
   */
  public CustomProcess[] getHeap() {
    return heap;
  }

  /**
   * Getter for INITIAL_CAPACITY for test use
   * 
   * @return INITIAL_CAPACITY
   */
  public static int getInitialCapacity() {
    return INITIAL_CAPACITY;
  }

}
