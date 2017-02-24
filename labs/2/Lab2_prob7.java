/**
   * file: Lab2_prob7.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: lab 2, problem 4.8
   * due date: February 9, 2017
   * version: 1.1
   * 
   * Finds the corresponding character to the ASCII entered.
   */

import java.util.Scanner;

public class Lab2_prob7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an ASCII code: ");
    int asc = input.nextInt();
    char ch = (char)asc;

    System.out.println("The character for ASCII code " + asc + " is " + ch);
  }
}

