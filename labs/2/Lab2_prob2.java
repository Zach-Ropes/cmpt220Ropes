/**
   * file: Lab2_prob2.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 3.8
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Orders the integers entered from least to greatest
   */

import java.util.Scanner;

public class Lab2_prob2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three integers: ");
    int int1 = input.nextInt();
    int int2 = input.nextInt();
    int int3 = input.nextInt();
    
    if (int1 < int2 && int1 < int3 && int2 < int3)
      System.out.print(int1 + ", " + int2 + ", " + int3);
    else if (int1 < int2 && int1 < int3 && int3 < int2)
      System.out.print(int1 + ", " + int3 + ", " + int2);
    else if (int2 < int1 && int2 < int3 && int1 < int3)
      System.out.print(int2 + ", " + int1 + ", " + int3);
    else if (int2 < int1 && int2 < int3 && int3 < int1)
      System.out.print(int2 + ", " + int3 + ", " + int1);
    else if (int3 < int2 && int3 < int1 && int1 < int2)
      System.out.print(int3 + ", " + int1 + ", " + int2);
    else if (int3 < int2 && int3 < int1 && int2 < int1)
      System.out.print(int3 + ", " + int2 + ", " + int1);
    else
      System.out.print("You messed up");
  }
}