/**
   * file: Prob10_17.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 7, problem 10.17
   * March 20, 2017
   * version: 1.0
   * 
   * Displays the width, height, area, and perimeter of each rectangle in this order
   */  
   
import java.math.BigDecimal;

public class Prob10_17 {
  public static void main(String[] args) {
    BigDecimal Maxval = new BigDecimal(Long.MAX_VALUE);
    long sqrtofmax = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal sqrt = new BigDecimal(sqrtofmax);
    System.out.println("The first ten square numbers that are greater than Long.Max_Value:");
    
    for (int i = 1; i <= 10; i++) {
      sqrt = sqrt.add(BigDecimal.ONE);
      BigDecimal squared = sqrt.multiply(sqrt);
      System.out.println(sqrt + " squared = " + squared);
    }
  }
}