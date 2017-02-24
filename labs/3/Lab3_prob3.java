/**
   * file: Lab3_prob3.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 5.12
   * February 23, 2017
   * version: 1.1
   * 
   * Finds the smallest possible integer for n where
   * n^2 is greater than 12,000.
   */  

public class Lab3_prob3 {
  public static void main(String[] args) {
    int n = 0;
    
    while (Math.pow(n, 2) < 12000) {
      n++;
    }
      
    

    System.out.println("The smallest integer n such that n^2 is greater than 12,000 is " + n);
  }
}