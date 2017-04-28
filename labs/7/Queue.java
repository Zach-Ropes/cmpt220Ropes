/**
   * file: Queue.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 7, problem 10.10
   * March 20, 2017
   * version: 1.0
   * 
   * First-in First-out
   */  

package Ropes;

public class Queue {
  private static int[] elements;
  private static int size;
  public static final int DEFAULT_CAPACITY = 8;

  /** Construct a queue with the default capacity 8 */
  public Queue() {
    this(DEFAULT_CAPACITY);
  }

  public Queue(int capacity) {
    elements = new int[capacity];
  }
  
  public static void enqueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[size * 2];
      System.arraycopy(elements, 0, temp, 0, size);
      elements = temp;
    }

    elements[size++] = v;
  }


  public static int dequeue() {
    int v = elements[0];
    size--;
    for (int r = 0; r < size; r++)
      elements[r] = elements[r + 1];
    return v;
  }

  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }
}