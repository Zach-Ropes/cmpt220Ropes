/**
   * file: Lab3_prob4.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 5.13
   * February 23, 2017
   * version: 1.1
   * 
   * The smallest possible integer n 
   * where n^3 is less than 12,000.
   */  

public class Lab3_prob4 {
  public static void main(String[] args) {
    int n = 0;
    
    while (Math.pow(n, 3) < 12000) {
      n++;
    }
    if (Math.pow(n, 3) > 12000)
      n--;
    

    System.out.println("The smallest integer n such that n^3 is less than 12,000 is " + n);
  }
}