/**
 * DrawingStackIterator.java
 * 
 * @author Merle Zhang
 * @data 11.7.18
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * the class for iterator of DrawingStack
 * 
 * @author Merle Zhang
 * @version 1.0
 */
public class DrawingStackIterator implements Iterator<DrawingChange> {

  /**
   * the current node
   */
  private Node<DrawingChange> curr;

  /**
   * the constructor of class DrawingStackIterator
   * 
   * @param node the first node iteration start from
   */
  public DrawingStackIterator(Node<DrawingChange> node) {
    this.curr = node;
  }

  /**
   * Return true if has next element, i.e., if current element is null
   * 
   * @return true if current is not null, false otherwise
   */
  @Override
  public boolean hasNext() {
    return curr != null ? true : false;
  }

  /**
   * Return the next element, i.e., return current element and set current to the next element. If
   * current element is null, print NoSuchElementException
   * 
   * @return current element
   */
  @Override
  public DrawingChange next() {
    try {
      DrawingChange tmp = this.curr.getData();
      this.curr = this.curr.getNext();
      return tmp;
    } catch (NullPointerException e) { // if current is null, the it means that there is no such
                                       // element
      throw new NoSuchElementException();
    }
  }
}
