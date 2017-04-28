/**
   * file: Queue.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 7, problem 10.10
   * March 20, 2017
   * version: 1.0
   * 
   * First-in First-out queue test
   */  

import Ropes.Queue;

public class QueueTest {
  public static void main(String[] args) {
    
    Queue queue = new Queue();
  
    for (int r = 1; r <= 20; r++) {
      queue.enqueue(r);
    }  
  
    for (int i = 0; i < 20; i++) {
      System.out.print(Queue.dequeue() + " ");
    }
  }
}