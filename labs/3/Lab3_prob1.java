/**
   * file: Lab3_prob1.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 3, problem 5.1
   * February 23, 2017
   * version: 1.1
   * 
   * Counts amount of positive and negative numbers
   * and calculates the total and average minus the 0s.
   */  

import java.util.Scanner;

public class Lab3_prob1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int num = input.nextInt();

    double total = 0;
    int pos = 0;
    int neg = 0;
    int count = 0;
    
    if (num == 0) {
      System.out.println("No numbers are entered except 0");
      }

    do {
      if (num > 0)
        pos++;
      else
        neg++;
    
      total += num;
      count++;
      num = input.nextInt();
      } while (num != 0);

    double average = total / count;

    System.out.println("The number of positive is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is total " + total);
    System.out.println("The average is " + average);
  }
}