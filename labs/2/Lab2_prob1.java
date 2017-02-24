/**
   * file: Lab2_prob1.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 3.4
   * due date: February 9, 2017
   * version: 1.1
   * 
   * When run outputs a random month.
   */

import java.util.Scanner;

public class Lab2_prob1 {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 12);
    number1 = number1 + 1;
    
    if (number1 == 1)
      System.out.print("January");
    else if (number1 == 2)
      System.out.print("February");
    else if (number1 == 3)
      System.out.print("March");
    else if (number1 == 4)
      System.out.print("April");
    else if (number1 == 5)
      System.out.print("May");
    else if (number1 == 6)
      System.out.print("June");
    else if (number1 == 7)
      System.out.print("July");
    else if (number1 == 8)
      System.out.print("August");
    else if (number1 == 9)
      System.out.print("September");
    else if (number1 == 10)
      System.out.print("October");
    else if (number1 == 11)
      System.out.print("November");
    else if (number1 == 12)
      System.out.print("December");
  }
}
