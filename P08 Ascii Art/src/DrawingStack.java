/**
 * DrawingStack.java
 * 
 * @author Merle Zhang
 * @data 11.07.18
 */
import java.util.Iterator;

/**
 * This class represents the stack of drawing
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class DrawingStack implements StackADT<DrawingChange> {
  /**
   * The top of the stack and the top of the linked list
   */
  private Node<DrawingChange> top;

  /**
   * Constructor of class DrawingStack. Initialize top to null.
   */
  public DrawingStack() {
    this.top = null;
  }

  /**
   * Add an element to this stack
   * 
   * @param element an element to be added
   * @throws IllegalArgumentException if the input element is null
   */
  @Override
  public void push(DrawingChange element) throws IllegalArgumentException {
    if (element == null)
      throw new IllegalArgumentException();
    Node<DrawingChange> nodeElement = new Node<DrawingChange>(element, null);
    nodeElement.setNext(this.top);
    this.top = nodeElement;
  }

  /**
   * Remove the element on the stack top and return it
   * 
   * @return the element removed from the stack top
   */
  @Override
  public DrawingChange pop() {
    if (this.top == null)
      return null;
    Node<DrawingChange> tmp = this.top;
    this.top = this.top.getNext();
    return tmp.getData();
  }

  /**
   * Get the element on the stack top
   * 
   * @return the element on the stack top
   */
  @Override
  public DrawingChange peek() {
    return this.top == null ? null : this.top.getData();
  }

  /**
   * Returns true if this stack contains no elements.
   * 
   * @return true if this stack contains no elements, otherwise false
   */
  @Override
  public boolean isEmpty() {
    return this.top == null ? true : false;
  }

  /**
   * Get the number of elements in the stack
   * 
   * @return the size of the stack
   */
  @Override
  public int size() {
    if (this.top == null)
      return 0;
    int size = 1;
    Node<DrawingChange> tmp = this.top;
    while (tmp.getNext() != null) {
      size++;
      tmp = tmp.getNext();
    }
    return size;
  }

  /**
   * Return the iterator iterate over the stack/linkedList
   * 
   * @return iterator of the stack
   */
  @Override
  public Iterator<DrawingChange> iterator() {
    return new DrawingStackIterator(this.top);
  }
}
